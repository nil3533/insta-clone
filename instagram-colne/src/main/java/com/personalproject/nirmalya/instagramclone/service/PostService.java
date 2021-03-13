/**
 * 
 */
package com.personalproject.nirmalya.instagramclone.service;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personalproject.nirmalya.instagramclone.entity.Post;
import com.personalproject.nirmalya.instagramclone.repository.PostRepo;

/**
 * @author Nirmalya
 *
 */
@Service
public class PostService {

	// private static final Logger logger = (Logger)
	// LoggerFactory.getLogger(PostService.class);

	@Autowired
	PostRepo postRepo;

	@Autowired
	UserService userService;

	public Post submitPostToDataBase(Post post) {
		return postRepo.save(post);
	}

	public ArrayList<Post> retrivePostFromDB() {

		ArrayList<Post> postList = postRepo.findAll();

		for (int i = 0; i < postList.size(); i++) {
			Post postItem = postList.get(i);
			/* /.info(postItem.getUserId()); */
			postItem.setUserName(userService.displayUserMetaData(postItem.getUserId()).getUserName());
		}
		Collections.sort(postList, (a, b) -> b.getId() - a.getId());
		return postList;
	}
}
