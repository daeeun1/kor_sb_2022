package com.kde.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 주석? -> 이러한 클래스는 이러한 것을 하는 것이다라는 것을 알려주는 기능입니다. (점원!!)
public class UsrHomeController {
	@RequestMapping("usr/home/main")
	@ResponseBody
	public String getSring() {  
		return "하이";
	}

}
