package site.buzhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import site.buzhou.dao.ArticleDao;
import site.buzhou.entity.Article;
import site.buzhou.service.ArticleService;

import java.util.List;

/**
 * @program: Jifry
 * @description: the controller for article
 * @author: 不周
 * @create: 2020-12-10 11:25
 **/

@Controller
@RequestMapping("/article")
public class ArticleController {
    ArticleService articleService;
    @GetMapping("/{id}")
    public String article(@PathVariable int id, Model model) {
        Article article = articleService.getArticleById(id);
        model.addAttribute("article",article);
        return "article";
    }
}
