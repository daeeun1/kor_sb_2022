package com.kde.exam.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kde.exam.vo.Article;

@Service // 얘 서비스야 하고 알려준 것 -> 객체 생성이라든지 이런걸 알려준다
public class ArticleService {
	// 인스턴스 변수 시작
		private List<Article> articles;
		private int articlesLastId;
		// 인스턴스 변수 끈

		// 생성자
		public ArticleService() {
			articles = new ArrayList<>();
			articlesLastId = 0;

			makeTestData();
		}

		public void makeTestData() {
			for (int id = 1; id <= 10; id++) {
				String title = "제목 " + id;
				String body = "내용 " + id;

				writeArticle(title, body);
			}
		}

		// 중복 제거 -> doAdd와 makeTestData의 중복을 제거
		public Article writeArticle(String title, String body) {
			int id = articlesLastId + 1;
			Article article = new Article(id, title, body);

			articlesLastId = id;
			articles.add(article);

			return article;
		}

		public Article getArticle(int id) {
			for (Article article : articles) {
				if (article.getId() == id) {
					return article;
				}
			}
			return null;
		}
		
		public void deleteArticle(int id) {
			Article article = getArticle(id);
			
			articles.remove(article);
		}
		
		public void modifyArticle(int id, String title, String body) {
			Article article = getArticle(id);
			
			article.setTitle(title);
			article.setBody(body);
		}

		public List<Article> getArticles() {
			return articles;
		}

}
