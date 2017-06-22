package com.jcchv.java.services;

import com.jcchv.java.data.SpringReposiroty;
import com.jcchv.java.model.Spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringServiceImpl implements SpringService {

    private SpringReposiroty springReposiroty;

    @Autowired
    public SpringServiceImpl(SpringReposiroty springReposiroty){
        this.springReposiroty=springReposiroty;
    }


    @Override
    public Spring getSpring() {
        return springReposiroty.getSpring();
    }
}
