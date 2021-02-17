package demo.login.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.RequestEntity.BodyBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.login.data.Post;
import demo.login.payload.request.PostRequest;
import demo.login.repository.PostRepository;

@RestController
@RequestMapping(path = "post")
public class PostController {
    @Autowired
    PostRepository postRepository;

    @PostMapping("/upload")
    public BodyBuilder uplaodImage(@RequestParam PostRequest postRequest) throws IOException {
        Post post = new Post(postRequest.getEnrollmentNo(), postRequest.getPostTitle(), postRequest.getContent(), postRequest.getPostType());
        postRepository.save(post);
        return (BodyBuilder) ResponseEntity.status(HttpStatus.OK);
    }


}
