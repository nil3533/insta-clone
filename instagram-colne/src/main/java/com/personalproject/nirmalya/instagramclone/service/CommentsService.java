/**
 * 
 */
package com.personalproject.nirmalya.instagramclone.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personalproject.nirmalya.instagramclone.entity.Comments;
import com.personalproject.nirmalya.instagramclone.repository.CommentRepo;

/**
 * @author Nirmalya
 *
 */
@Service
public class CommentsService {
	@Autowired
	CommentRepo commentRepo;

	@Autowired
	UserService userService;

	public Comments submitCommentToDB(Comments comment) {
		return commentRepo.save(comment);
	}

	public ArrayList<Comments> getAllCommentsForDB(String postId) {

		ArrayList<Comments> commentList = commentRepo.findAllByPostId(postId);

		for (Comments comments : commentList) {
			comments.setUserName(userService.displayUserMetaData(comments.getUserId()).getUserName());
		}

		/*
		 * for (int i = 0; i < commentList.size(); i++) { Comments commentItem =
		 * commentList.get(i);
		 * commentItem.setUserName(userService.displayUserMetaData(commentItem.getUserId
		 * ()).getUserName()); }
		 */

		return commentList;

	}
}
