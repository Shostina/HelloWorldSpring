package ru.dreamteam.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.dreamteam.request.HelloReq;
import ru.dreamteam.response.HelloResp;


@RestController
public class HelloWorldController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HelloResp sayHello(@RequestBody HelloReq req) {
        return new HelloResp("Hello " + req.getName());
    }
}
