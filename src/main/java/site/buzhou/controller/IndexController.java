package site.buzhou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import site.buzhou.entity.ShowSubject;
import site.buzhou.entity.Subject;
import site.buzhou.service.SubjectService;

import java.util.List;

/**
 * @program: Jifry
 * @description:
 * @author: 不周
 * @create: 2020-12-11 17:17
 **/
@Controller
public class IndexController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping({"/index", "/"})
    public String index(Model model, @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum, RedirectAttributes attributes){
       PageHelper.startPage(pageNum,5);
        List<ShowSubject> showSubjects = subjectService.getAllSubjectAndArticle();
        PageInfo<ShowSubject> pageInfo = new PageInfo<>(showSubjects);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("subjectsWithArticle",showSubjects);
        return "index";
    }
}
