package com.kde.exam.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kde.exam.vo.Article;

@Controller // 주석? -> 이러한 클래스는 이러한 것을 하는 것이다라는 것을 알려주는 기능입니다. (점원!!)
public class UsrHomeController {
	@RequestMapping("usr/home/getString")
	@ResponseBody
	public String getSring() {  
		return "하이";
	}
	
	@RequestMapping("usr/home/getInt")
	@ResponseBody
	public int getInt() {  
		return 10;
	}
	
	@RequestMapping("/usr/home/getBoolean")
	@ResponseBody
	public Boolean getBoolean() {  
		return true; // 브라우저로 넘어가는데 이 참 거짓이 아니라 그냥 알파벳 true가 넘어간 것
	}
	
	@RequestMapping("/usr/home/getFloat")
	@ResponseBody     // 이것이 이해할 수 있게 바꾸어 주는 것이다아
	public Float getFloat() {  
		return 10.5f; // 이건 10.5 -> 일공점오 이렇게 string 로 넘어간다.
	}
	
	@RequestMapping("/usr/home/getMap")
	@ResponseBody
	public Map<String, Object> getMap() {  
		Map<String, Object> map = new HashMap<>();
		map.put("철수", 21);
		map.put("영희", 22);
		return map;
	}
	
	@RequestMapping("/usr/home/getList")
	@ResponseBody
	public List<String> getList() {  
		List<String> list = new ArrayList<>();
		list.add("철수");
		list.add("영희");
		return list;
	}
	
	@RequestMapping("/usr/home/getArticle")
	@ResponseBody
	public Article getArticle() {  
		Article article = new Article(1, "제목1", "내용1");
		return article;
	}
	
	@RequestMapping("/usr/home/getArticles")
	@ResponseBody
	public List<Article> getArticles() {  
		Article article1 = new Article(1, "제목1", "내용1");
		Article article2 = new Article(2, "제목2", "내용2");
		
		List<Article> list = new ArrayList<>();
		list.add(article1);
		list.add(article2);
		
		return list;
	}
}
