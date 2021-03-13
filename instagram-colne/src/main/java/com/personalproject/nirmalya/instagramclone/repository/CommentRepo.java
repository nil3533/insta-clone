package com.personalproject.nirmalya.instagramclone.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.personalproject.nirmalya.instagramclone.entity.Comments;

@Repository
public interface CommentRepo extends CrudRepository<Comments, Integer> {

	Comments save(Comments comment);

	ArrayList<Comments> findAllByPostId(String postId);

	@Override
	ArrayList<Comments> findAll();
}
