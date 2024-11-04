package com.sparta.springmvc.response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/response/rest")
public class ResponseRestController {
    // [Response header]
    //   Content-Type: text/html
    // [Response body]
    //   {"name":"Jinwoo","age":26}
    @GetMapping("/json/string")
    public String helloStringJson() {
        return "{\"name\":\"Jinwoo\",\"age\":26}";
    }

    // [Response header]
    //   Content-Type: application/json
    // [Response body]
    //   {"name":"Jinwoo","age":26}
    @GetMapping("/json/class")
    public Star helloClassJson() {
        return new Star("Jinwoo", 26);
    }
}