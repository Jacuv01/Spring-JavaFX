package com.jcchv.java.data;

import com.jcchv.java.model.Spring;
import org.springframework.stereotype.Repository;

@Repository
public class SpringRepositoryImpl implements SpringReposiroty {
    @Override
    public Spring getSpring() {
        Spring spring = new Spring("Hello Spring");
        return spring;
    }
}
