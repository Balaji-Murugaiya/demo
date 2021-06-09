package com.learning.webip.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Controller {

    @GetMapping("/wantIP")
    public String yourIP(HttpServletRequest request)
    {
        return request.getRemoteAddr() ;
    }
}
