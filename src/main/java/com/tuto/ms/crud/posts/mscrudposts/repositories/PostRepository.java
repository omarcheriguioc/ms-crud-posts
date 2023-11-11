package com.tuto.ms.crud.posts.mscrudposts.repositories;

import com.tuto.ms.crud.posts.mscrudposts.models.Post;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PostRepository extends ReactiveCrudRepository<Post, Long> {
}
