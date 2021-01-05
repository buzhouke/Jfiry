package site.buzhou.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import site.buzhou.entity.Author;

@Mapper
@Repository
public interface AuthorDao {
    Author checkAuthor(String username, String password);

    int addAuthor(Author author);

    int deleteAuthor(Author author);

    int updateAuthor(Author author,String password);
}
