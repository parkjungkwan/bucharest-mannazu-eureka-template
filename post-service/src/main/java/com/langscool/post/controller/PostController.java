package com.langscool.post.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.langscool.post.domain.PostDTO;
import com.langscool.post.entity.PostEntity;
import com.langscool.post.sevice.PostService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("")
    public List<PostEntity> getPostList(){
        return postService.findAll();
    }
    // Optional<T> findById(ID id)
    @GetMapping("/{id}")
    public Optional<PostEntity> findById(@PathVariable Long id){
        return postService.findById(id);
    }

    @PostMapping("")
    public PostEntity createPost(@RequestBody PostEntity post){
        return postService.save(post);
    }

    @PutMapping("")
    public String updatePost(@RequestBody PostEntity post){
        postService.update(post);
        return "SUCCESS";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id){
        postService.deleteById(id);
        return "SUCCESS";
    }

    
}
