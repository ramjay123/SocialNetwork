package com.sg.smn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sg.smn.entity.UserData;

public interface UserRepository extends JpaRepository<UserData, Integer> {
	
	UserData findByEmailidAndPassword(String emailid,String password);

}
