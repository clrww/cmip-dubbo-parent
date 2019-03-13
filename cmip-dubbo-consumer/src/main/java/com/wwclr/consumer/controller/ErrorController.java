package com.wwclr.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wwclr on 2019/3/12.
 */
@Controller
@RequestMapping("error")
public class ErrorController {
    @RequestMapping("/errorPage")
    public String errorPage(){
        int a=1/0;
        return "error";
    }
}
