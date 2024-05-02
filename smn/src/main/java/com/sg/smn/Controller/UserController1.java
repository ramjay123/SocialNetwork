package com.sg.smn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.teca.hotel.entity.UserInformation;

import com.sg.smn.dao.Userdao;
import com.sg.smn.entity.UserData;

@Controller
public class UserController1 {

	@Autowired
	private Userdao userdao;
	
	
	@RequestMapping("/register")
	public String getRegisterPage(Model model){
		UserData data = new UserData();
		//ModelAndView model = new ModelAndView("register");
		model.addAttribute("userdata",data);
		return "sign_up_page ";
	}
	
	@RequestMapping("/userdetails")
	public String userDetails( UserData data,Model model) {
		//System.err.println(data);
		UserData registration = userdao.userRegistration(data);
		if (registration!=null) {
			return "Login";
		} else {
			model.addAttribute("msg", "Invalid Details");
			return "Invalid Details";
		}
		//System.err.println(userInformation);
	}
	
	@RequestMapping("/loginpage")
	public String loginPage() {
		return "Login";
	}
	
	
	@RequestMapping("/searchByName")
	public String getFriends(String sname,Model model) {
		System.err.println(sname);
		List<UserData> list = userdao.getFriendsDetails(sname);
		model.addAttribute("friendslist", list);
		return "Home";
		
	}
}










