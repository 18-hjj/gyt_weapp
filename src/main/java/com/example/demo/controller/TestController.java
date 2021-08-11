package com.example.demo.controller;

import com.example.demo.bean.Dict;
import com.example.demo.mapper.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private Test test;

    @GetMapping("test")
    @ResponseBody
    public List<Dict> test(){
        System.out.println("PPPPPPPP");
        return test.test1();
    }
}
