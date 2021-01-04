package ru.dreamteam.request;

import lombok.Data;

@Data
public class HelloReq {
    private String name;
    public HelloReq(String name) {
        this.name = name;
    }
}
