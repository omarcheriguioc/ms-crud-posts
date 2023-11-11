package com.tuto.ms.crud.posts.mscrudposts.repositories;

import com.tuto.ms.crud.posts.mscrudposts.models.Comment;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CommentRepository extends ReactiveCrudRepository<Comment, Long> {

    @Query("SELECT * FROM comment WHERE post_id = :#{[0]}")
    Flux<Comment> getByPostId(Long postId);
}
