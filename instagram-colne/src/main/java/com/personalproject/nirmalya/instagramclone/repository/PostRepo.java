package com.personalproject.nirmalya.instagramclone.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.personalproject.nirmalya.instagramclone.entity.Post;

@Repository
public interface PostRepo extends CrudRepository<Post, Integer> {

	Post save(Post post);

	@Override
	ArrayList<Post> findAll();

}
