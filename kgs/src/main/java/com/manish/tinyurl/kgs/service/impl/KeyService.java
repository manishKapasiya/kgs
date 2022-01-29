package com.manish.tinyurl.kgs.service.impl;

import com.manish.tinyurl.kgs.constants.KeyStatus;
import com.manish.tinyurl.kgs.data.entity.KeyEntity;
import com.manish.tinyurl.kgs.data.repository.KeyRepo;
import com.manish.tinyurl.kgs.exception.GetKeyException;
import com.manish.tinyurl.kgs.service.IKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.manish.tinyurl.kgs.constants.Error.*;

@Service
public class KeyService implements IKeyService {

    private KeyRepo keyRepo;

    public KeyService(@Autowired KeyRepo keyRepo){
        this.keyRepo = keyRepo;
    }

    @Override
    public List<String> getKeys() throws GetKeyException {
        try {
            List<KeyEntity> keyEntities = keyRepo.findTopByStatus(KeyStatus.FREE.name());

            keyEntities.forEach(keyEntity -> {
                keyEntity.setStatus(KeyStatus.USED.name());
                keyRepo.save(keyEntity);
            });

            return  keyEntities.
                    stream().
                    map(key -> key.getKeyValue()).
                    collect(Collectors.toList());
        }catch (Exception e){
            throw new GetKeyException(GET_KEY_EXCEPTION_ERROR_CODE,
                    GET_KEY_EXCEPTION_ERROR_MESSAGE,
                    GET_KEY_EXCEPTION_ERROR_HTTP_STATUS);
        }
    }

}
