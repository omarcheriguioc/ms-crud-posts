package com.tuto.ms.crud.posts.mscrudposts.controllers;

import com.tuto.ms.crud.posts.mscrudposts.models.Comment;
import com.tuto.ms.crud.posts.mscrudposts.models.Post;
import com.tuto.ms.crud.posts.mscrudposts.services.BlogService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/posts")
public class BlogController {
    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @PostMapping
    public Mono<Post> createPost(@RequestBody Post post) {
        return blogService.createPost(post);
    }

    @GetMapping("/{postId}")
    public Mono<Post> getPost(@PathVariable Long postId) {
        return blogService.getPostById(postId);
    }

    @GetMapping
    public Flux<Post> getAllPosts() {
        return blogService.getAllPosts();
    }

    @PostMapping("/comments")
    public Mono<Comment> createComment(@RequestBody Comment comment) {
        return blogService.createComment(comment);
    }

    @GetMapping("/{postId}/comments")
    public Flux<Comment> getCommentsByPost(@PathVariable Long postId) {
        return blogService.getCommentsByPostId(postId);
    }

    @DeleteMapping("/{postId}")
    public Mono<Void> deletePost(@PathVariable Long postId) {
        return blogService.deletePost(postId);
    }

    @DeleteMapping("/comments/{commentId}")
    public Mono<Void> deleteComment(@PathVariable Long commentId) {
        return blogService.deleteComment(commentId);
    }
}
