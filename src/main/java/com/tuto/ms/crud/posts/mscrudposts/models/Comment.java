package com.tuto.ms.crud.posts.mscrudposts.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("comment")
@Data
public class Comment {

    @Id
    private Long id;
    private Long postId; // The ID of the post associated with the comment
    private String text;
}
