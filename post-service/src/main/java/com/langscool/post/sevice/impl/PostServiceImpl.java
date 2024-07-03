package com.langscool.post.sevice.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.langscool.post.entity.PostEntity;
import com.langscool.post.repository.PostRepository;
import com.langscool.post.sevice.PostService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    @Override
    public List<PostEntity> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Optional<PostEntity> findById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public PostEntity save(PostEntity post) {
        return postRepository.save(post);
    }

    @Override
    public void update(PostEntity post) {
        postRepository.update(post);
    }

    @Override
    public void deleteById(Long id) {
        postRepository.deleteById(id);
    }
    
}
