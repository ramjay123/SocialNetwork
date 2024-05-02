package com.sg.smn.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sg.smn.entity.UserData;
import com.sg.smn.repositories.UserRepository;

@Component
public class UserdaoImp implements Userdao {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserData userRegistration(UserData data) {
		return userRepository.save(data);
	}

	@Override
	public UserData loginDetails(String email, String password) {
		//UserData emailidAndPassword = userRepository.findByEmailidAndPassword(email, password);
		return userRepository.findByEmailidAndPassword(email, password);
	}

	public UserdaoImp() {
		System.out.println("UserDaoImpl object created");
	}

	@Override
	public List<UserData> getFriendsDetails(String sname) {
		return userRepository.findByName(sname);
	}
	
	

}
