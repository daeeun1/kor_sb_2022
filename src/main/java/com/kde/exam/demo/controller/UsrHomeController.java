package com.kde.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 주석? -> 이러한 클래스는 이러한 것을 하는 것이다라는 것을 알려주는 기능입니다. (점원!!)
public class UsrHomeController {
	@RequestMapping("usr/home/main")
	@ResponseBody
	public String showMain() {
		return "안녕하세요";
	}

	@RequestMapping("usr/home/main2")
	@ResponseBody
	public String showMain2() {
		return "반갑습니다.";
	}
	
	@RequestMapping("usr/home/main3")
	@ResponseBody
	public String showMain3() {
		return "또 만나요.";
	}
}
