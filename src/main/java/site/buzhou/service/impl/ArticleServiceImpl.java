package site.buzhou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.buzhou.dao.ArticleDao;
import site.buzhou.entity.Article;
import site.buzhou.entity.Author;
import site.buzhou.entity.Subject;
import site.buzhou.service.ArticleService;

import java.util.List;

/**
 * @program: Jifry
 * @description:
 * @author: 不周
 * @create: 2020-12-10 15:19
 **/
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleDao articleDao;

    @Override
    public List<Article> getArticleBySubject(Subject subject) {
        return articleDao.getArticleBySubject(subject.getId());
    }

    @Override
    public Article getArticleById(int id) {
        return null;
    }

    @Override
    public int deleteArticle(String id) {
        return 0;
    }

    @Override
    public int UpdateArticle(String id) {
        return 0;
    }

    @Override
    public List<Article> getArticleByAuthor(Author author) {
        return null;
    }

    @Override
    public int addArticle(Article article) {
        return 0;
    }
}
