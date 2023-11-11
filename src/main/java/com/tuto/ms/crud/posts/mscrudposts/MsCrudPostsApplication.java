package com.tuto.ms.crud.posts.mscrudposts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.tuto.ms.crud.posts.mscrudposts.models")
public class MsCrudPostsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCrudPostsApplication.class, args);
	}

}
