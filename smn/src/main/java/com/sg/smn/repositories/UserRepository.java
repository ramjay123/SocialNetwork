package com.sg.smn.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sg.smn.entity.UserData;

public interface UserRepository extends JpaRepository<UserData, Integer> {
	
	UserData findByEmailidAndPassword(String emailid,String password);
	
	@Query("select sname from user_data d where d.fname like %?1% or d.lname like %?1%")
	List<UserData> findByName(String sname);

}
