/**
 * 
 */
package com.personalproject.nirmalya.instagramclone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.personalproject.nirmalya.instagramclone.entity.Users;

/**
 * @author Nirmalya
 *
 */
@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {
	@Override
	Users save(Users user);

	Users findByUserId(String userId);

}
