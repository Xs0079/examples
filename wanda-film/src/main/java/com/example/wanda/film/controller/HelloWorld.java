package com.example.wanda.film.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Xu Sheng on 2021/5/22.
 */
@Controller
public class HelloWorld {

    @RequestMapping(path = "/hw")
    @ResponseBody
    public String helloWorld() {
        return "helloWorld";
    }
}
