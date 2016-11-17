package com.onelife.fun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wudi.
 * Descreption:外部接受类.
 * Date:2016/11/16
 */
@RequestMapping("/api")
@RestController
public class ReceiveController {

    @RequestMapping("/getWeather")
    public String getWeather() {
        return "今天天晴~";
    }
}
