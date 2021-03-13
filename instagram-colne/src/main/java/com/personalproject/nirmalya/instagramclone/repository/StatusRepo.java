package com.personalproject.nirmalya.instagramclone.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.personalproject.nirmalya.instagramclone.entity.Status;

@Repository
public interface StatusRepo extends CrudRepository<Status, Integer> {

	@Override
	Status save(Status save);

	@Override
	ArrayList<Status> findAll();
}
