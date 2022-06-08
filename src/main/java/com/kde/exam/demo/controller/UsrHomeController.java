package com.kde.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 주석? -> 이러한 클래스는 이러한 것을 하는 것이다라는 것을 알려주는 기능입니다. (점원!!)
public class UsrHomeController {
	private int count;
	
	UsrHomeController(){
		count ++;
	}
	
	@RequestMapping("usr/home/getCount")
	@ResponseBody
	public int getCount() {
		return count++;
	}

	@RequestMapping("usr/home/doSetCount")
	@ResponseBody
	public String doSetCount(int count) { // http://localhost:8011/usr/home/doSetCount?count=12 
		this.count = count;
		return "count의 값이 " + this.count + "으로 초기화 되었습니다.";
	}
}
