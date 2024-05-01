package com.sg.smn.dao;

import com.sg.smn.entity.UserData;

public interface Userdao {
	UserData userRegistration(UserData data);
	UserData loginDetails(String email,String password);

}
