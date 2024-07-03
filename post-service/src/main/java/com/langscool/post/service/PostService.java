package com.langscool.post.service;

import java.util.List;
import java.util.Optional;

import com.langscool.post.entity.PostEntity;

public interface PostService {

    List<PostEntity> findAll();

    Optional<PostEntity> findById(Long id);

    PostEntity save(PostEntity post);

    void updateTitleById(PostEntity post);

    void deleteById(Long id);
    
}
