package com.kde.exam.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kde.exam.demo.repository.ArticleRepository;
import com.kde.exam.vo.Article;

@Service // 얘 서비스야 하고 알려준 것 -> 객체 생성이라든지 이런걸 알려준다
public class ArticleService {
	private ArticleRepository articleRepository;

	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	public int writeArticle(String title, String body) {
		articleRepository.writeArticle(title, body);
		return articleRepository.getLastInsertId();
	}

	public List<Article> getArticles() {
		return articleRepository.getArticles();
	}

	public Article getArticle(int id) {
		return articleRepository.getArticle(id);
	}

	public void deleteArticle(int id) {
		articleRepository.deleteArticle(id);
	}

	public void modifyArticle(int id, String title, String body) {
		articleRepository.modifyArticle(id, title, body);
	}

}
