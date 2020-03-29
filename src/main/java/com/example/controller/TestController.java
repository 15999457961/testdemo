package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: bin.yang
 * @Date: 2018/11/30 17:09
 * @Description:
 */
@Controller
@RequestMapping("hello")
public class TestController {

    @RequestMapping(value = "getCode" , method = RequestMethod.GET)
    @ResponseBody
    public String getCode(String encrypt_code, String card_id, HttpServletRequest request) {

        String requestURI = request.getRequestURI();

        String queryString = request.getQueryString();

        System.err.println(encrypt_code +"  |_|  "+ card_id);

        System.err.println(requestURI);

        System.err.println(queryString);

        System.err.println(requestURI+"?"+queryString);

        return requestURI+"?"+queryString;
    }

}
