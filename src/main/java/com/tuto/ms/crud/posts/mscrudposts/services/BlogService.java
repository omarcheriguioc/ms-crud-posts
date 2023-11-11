package com.tuto.ms.crud.posts.mscrudposts.services;

import com.tuto.ms.crud.posts.mscrudposts.models.Comment;
import com.tuto.ms.crud.posts.mscrudposts.models.Post;
import com.tuto.ms.crud.posts.mscrudposts.repositories.CommentRepository;
import com.tuto.ms.crud.posts.mscrudposts.repositories.PostRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BlogService {
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public BlogService(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    public Mono<Post> createPost(Post post) {
        return postRepository.save(post);
    }

    public Mono<Comment> createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public Mono<Post> getPostById(Long postId) {
        return postRepository.findById(postId);
    }

    public Flux<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Flux<Comment> getCommentsByPostId(Long postId) {
        return commentRepository.getByPostId(postId);
    }

    public Mono<Void> deletePost(Long postId) {
        return postRepository.deleteById(postId);
    }

    public Mono<Void> deleteComment(Long commentId) {
        return commentRepository.deleteById(commentId);
    }
}
