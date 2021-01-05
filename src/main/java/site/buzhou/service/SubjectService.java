package site.buzhou.service;

import site.buzhou.entity.ShowSubject;
import site.buzhou.entity.Subject;

import java.util.List;

/**
 * @program: Jifry
 * @description: /
 * @author: 不周
 * @create: 2020-12-09 21:41
 **/
public interface SubjectService {
    List<Subject> getAllSubject();
    
    int saveSubject(Subject Subject);

    Subject getSubject(int id);

    List<ShowSubject>getAllSubjectAndArticle();

    Subject getSubjectByName(String name);

    int updateSubject(Subject Subject);

    void deleteSubject(Long id);
}
