package com.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 林少君
 * @Date: 2020/5/21 17:05
 */
@Slf4j
@RestController
public class TestController {

    @GetMapping(value = "aaa")
    public JSONObject test() {

        log.info("a");
        log.warn("a");
        log.error("a");
        log.trace("a");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("a", "aaa");
        return jsonObject;
    }
}
