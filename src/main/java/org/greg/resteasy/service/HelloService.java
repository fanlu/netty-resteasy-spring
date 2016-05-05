package org.greg.resteasy.service;

import org.springframework.stereotype.Service;

/**
 * Created by Lonica on 16/5/5.
 */
@Service
public class HelloService {

    public String echo(String s){
        return "hello" + s;
    }
}
