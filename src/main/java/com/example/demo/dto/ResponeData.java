package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponeData<T>{
    private boolean status;
    private List<String> messages = new ArrayList<>();
    private T payload;
}
