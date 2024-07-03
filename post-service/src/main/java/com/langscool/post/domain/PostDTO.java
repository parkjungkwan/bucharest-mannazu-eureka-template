package com.langscool.post.domain;

import org.springframework.stereotype.Component;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Component
public class PostDTO {

    private Long id;
    private String title;
    private String content;
    
}
