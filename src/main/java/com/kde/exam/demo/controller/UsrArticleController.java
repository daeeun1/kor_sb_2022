package com.kde.exam.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kde.exam.vo.Article;

@Controller
public class UsrArticleController {
	private List<Article> articles;
	private int articlesLastId;

	public UsrArticleController() {
		articles = new ArrayList<>();
		articlesLastId = 0;

		makeTestData();
	}

	private void makeTestData() {
		for (int id = 1; id <= 10; id++) {
			id = articlesLastId + 1;
			String title = "제목 "+ id;
			String body = "내용 "+ id;
			Article article = new Article(id, title, body);

			articlesLastId = id;
			articles.add(article);
		}
	}

	@RequestMapping("/usr/article/doAdd")
	@ResponseBody
	public Article doAdd(String title, String body) {
		int id = articlesLastId + 1;
		Article article = new Article(id, title, body);

		articlesLastId = id;
		articles.add(article);

		return article;
	}

	@RequestMapping("/usr/article/getArticles")
	@ResponseBody
	public List<Article> getArticles() {
		return articles;
	}

	// 1번글이 삭제 되었습니다. or 1번글은 존재하지 않습니다.
	@RequestMapping("/usr/article/doDelete")
	@ResponseBody
	public String doDelete(int id) {
		for (Article article : articles) {
			if (article.id == id) {
				articles.remove(id - 1);
				return "1번글이 삭제 되었습니다.";
			}
		}
		return "1번글은 존재하지 않습니다.";
	}

	// 1번글이 수정 되었습니다. or 1번글은 존재하지 않습니다.
	@RequestMapping("/usr/article/doModify")
	@ResponseBody
	public Article doModify(int id, String title, String body) {
		for (Article article : articles) {
			if (article.id == id) {
				article.id = id;
				article.title = title;
				article.body = body;
				return articles.get(id - 1);
			}
		}
		return null;
	}
}
