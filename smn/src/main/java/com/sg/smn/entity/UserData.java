package com.sg.smn.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class UserData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	@Column(name = "fname")
	private String firstname;
	@Column(name = "lname")
	private String lastname;
	@Column(name = "email",unique = true,nullable = false)
	private String emailid;
	@Column(name = "password",unique = true,nullable = false,length = 4)
	private String password;
	@Column(name = "dob")
	private LocalDate dob;
	@Column(name = "mobile",unique = true,nullable = false,length = 10)
	private String mobile;
	@Column(name = "gender",nullable = false,length = 1)
	private String gender;

}
