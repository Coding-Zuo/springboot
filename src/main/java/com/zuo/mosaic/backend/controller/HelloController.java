package com.zuo.mosaic.backend.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zuo.mosaic.po.User;

@Controller
public class HelloController {

	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView index(Model model){
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("name", "123");
		Map<String , Object> map=new HashMap<>();
		map.put("name", 123);
		mv.addObject("userList", this.preperList());
		model.addAttribute("map", map);
 		return mv;
	}
	
	public List<User> preperList(){
		List<User> list=new ArrayList<>();
		for(int i=0;i<5;i++){
			User user=new User();
			user.setBirthday(new Date());
			user.setName("zuo"+i);
			user.setId(i);
			list.add(user);
		}
		return list;
	}
	
	
	
}
