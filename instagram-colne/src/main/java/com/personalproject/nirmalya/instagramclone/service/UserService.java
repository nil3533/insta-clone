/**
 * 
 */
package com.personalproject.nirmalya.instagramclone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personalproject.nirmalya.instagramclone.entity.Users;
import com.personalproject.nirmalya.instagramclone.repository.UserRepo;

/**
 * @author Nirmalya
 *
 */
@Service
public class UserService {
	@Autowired
	UserRepo userRepo;

	public Users submitMetaDataOfUser(Users user) {
		return userRepo.save(user);
	}

	public Users displayUserMetaData(String userid) {
		return userRepo.findByUserId(userid);
	}
}
