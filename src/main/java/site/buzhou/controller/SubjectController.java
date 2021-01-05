package site.buzhou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import site.buzhou.entity.Article;
import site.buzhou.entity.Subject;
import site.buzhou.service.ArticleService;
import site.buzhou.service.SubjectService;

import java.util.List;

/**
 * @program: Jifry
 * @description: the controller for subject
 * @author: 不周
 * @create: 2020-12-10 10:27
 **/
@Controller
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @Autowired
    ArticleService articleService;

    @GetMapping("/{id}")
    public String subject(@PathVariable int id, Model model) {
        Subject subject = subjectService.getSubject(id);
        List<Article> articles = articleService.getArticleBySubject(subject);
        model.addAttribute("subject", subject);
        model.addAttribute("articles", articles);
        return "subject";
    }

}
