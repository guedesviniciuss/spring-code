package com.example.demo.post;

import com.example.demo.jsonplaceholder.JsonPlaceholderClient;
import com.example.demo.jsonplaceholder.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    private final JsonPlaceholderClient jsonPlaceholderClient;

    @Autowired
    public PostController(JsonPlaceholderClient jsonPlaceholderClient) {
        this.jsonPlaceholderClient = jsonPlaceholderClient;
    }

    @GetMapping
    List<Post> getPosts() {
        return this.jsonPlaceholderClient.getPosts();
    }

    @GetMapping("/{postId}")
    Post getPost(@PathVariable("postId") Integer postId) {
        return this.jsonPlaceholderClient.getPost(postId);
    }

}
