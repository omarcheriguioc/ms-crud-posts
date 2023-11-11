package com.tuto.ms.crud.posts.mscrudposts.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("post")
@Data
public class Post {

    @Id
    private Long id;
    private String title;
    private String content;

}
