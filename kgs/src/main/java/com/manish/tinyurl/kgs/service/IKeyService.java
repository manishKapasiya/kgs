package com.manish.tinyurl.kgs.service;

import com.manish.tinyurl.kgs.exception.GetKeyException;

import java.util.List;

public interface IKeyService {

    List<String> getKeys() throws GetKeyException;
}
