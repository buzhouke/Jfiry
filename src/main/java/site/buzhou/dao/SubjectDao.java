package site.buzhou.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import site.buzhou.entity.ShowSubject;
import site.buzhou.entity.Subject;

import java.util.List;

@Mapper
@Repository
public interface SubjectDao {
    List<Subject> getAllSubject();

    int saveSubject(Subject Subject);

    Subject getSubject(int id);

    List<ShowSubject>getAllSubjectAndArticle();

    Subject getSubjectByName(String name);

    int updateSubject(Subject Subject);

    void deleteSubject(Long id);
}
