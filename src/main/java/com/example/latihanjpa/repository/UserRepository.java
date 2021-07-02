package com.example.latihanjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.latihanjpa.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query(value = "Select user_id, user_nama, user_umur, user_address from users "
			+ "where user_address LIKE %?1% ", nativeQuery = true)
	public List<User> findAddress(List<String> user_address);

}
