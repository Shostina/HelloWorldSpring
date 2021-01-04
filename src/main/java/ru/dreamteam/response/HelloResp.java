package ru.dreamteam.response;

import lombok.Data;

@Data
public class HelloResp {
    String answer;
    public HelloResp(String answer) {
        this.answer = answer;
    }
}
