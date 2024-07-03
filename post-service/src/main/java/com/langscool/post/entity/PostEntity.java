package com.langscool.post.entity;

import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class PostEntity {
    private Long id;
    private String title;
    private String content;
    
}
