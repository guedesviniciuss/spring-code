package com.example.demo.jsonplaceholder;

import lombok.Data;

@Data
public class Post {
    private final Integer id;
    private final Integer userId;
    private final String title;
    private final String body;
}
