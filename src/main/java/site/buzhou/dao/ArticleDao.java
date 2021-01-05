package site.buzhou.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import site.buzhou.entity.Article;
import site.buzhou.entity.Author;
import site.buzhou.entity.Subject;

import java.util.List;

/**
 * @program: Jifry
 * @description:
 * @author: 不周
 * @create: 2020-12-10 15:18
 **/
@Mapper
@Repository
public interface ArticleDao {
    List<Article> getArticleBySubject(int id);

    Article getArticleById(int id);

    int deleteArticle(String id);

    int updateArticle(String id);

    List<Article> getArticleByAuthor(Author author);

    int addArticle(Article article);
}
