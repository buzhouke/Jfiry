package site.buzhou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.buzhou.dao.SubjectDao;
import site.buzhou.entity.ShowSubject;
import site.buzhou.entity.Subject;
import site.buzhou.service.SubjectService;

import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    SubjectDao subjectDao;

    @Override
    public List<Subject> getAllSubject() {
        return subjectDao.getAllSubject();
    }

    @Override
    public int saveSubject(Subject Subject) {
        return 0;
    }

    @Override
    public Subject getSubject(int id) {
        return subjectDao.getSubject(id);
    }

    @Override
    public List<ShowSubject> getAllSubjectAndArticle() {
        return subjectDao.getAllSubjectAndArticle();
    }

    @Override
    public Subject getSubjectByName(String name) {
        return null;
    }

    @Override
    public int updateSubject(Subject Subject) {
        return 0;
    }

    @Override
    public void deleteSubject(Long id) {

    }
}
