package site.buzhou.service;

import site.buzhou.entity.Article;
import site.buzhou.entity.Author;
import site.buzhou.entity.Subject;

import java.util.List;

public interface ArticleService {
    List<Article> getArticleBySubject(Subject subject);

    Article getArticleById(int id);

    int deleteArticle(String id);

    int UpdateArticle(String id);

    List<Article> getArticleByAuthor(Author author);

    int addArticle(Article article);

}
