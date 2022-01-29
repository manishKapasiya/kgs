package com.manish.tinyurl.kgs.web.resources;

import com.manish.tinyurl.kgs.service.IKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/keys")
public class KeyResource {

    private IKeyService keyService;

    public KeyResource(@Autowired IKeyService keyService){
        this.keyService = keyService;
    }

    @GetMapping
    public ResponseEntity<List<String>> getKeys(){
        List<String> keys = keyService.getKeys();
        return new ResponseEntity(keys, HttpStatus.OK);
    }

}
