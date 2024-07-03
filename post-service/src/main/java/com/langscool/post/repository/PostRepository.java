package com.langscool.post.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.langscool.post.entity.PostEntity;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long>{

    @Modifying
    @Query("update PostEntity set title = :title where id = :id")
    void updateTitleById(@Param("title")String title, @Param("id") Long id);
    
}
