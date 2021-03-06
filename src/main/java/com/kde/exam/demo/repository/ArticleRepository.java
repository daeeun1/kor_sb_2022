package com.kde.exam.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.kde.exam.demo.vo.Article;

@Mapper
public interface ArticleRepository {
	// INSERT INTO article SET regDate = NOW(), updateDate = NOW(), title = ?, `body` = ?;
	public void writeArticle(@Param("title") String title,@Param("body") String body);
	
	// SELECT * FROM article WHERE id = ?
	public Article getArticle(@Param("id") int id);

	// DELETE FROM article WHERE id = ?
	public void deleteArticle(@Param("id") int id);

	// UPDATE article SET title = ?, `body` = ?, updateDate = NOW() WHERE id = ?;
	public void modifyArticle(@Param("id") int id, @Param("title") String title,@Param("body") String body);

	// SELECT * FROM article ORDER BY id DESC;
	public List<Article> getArticles();

	public int getLastInsertId();
}