package site.buzhou.service;

import site.buzhou.entity.Author;

public interface UserService {
    Author checkAuthor(String username, String password);

    int addAuthor(Author author);

    int deleteAuthor(Author author);

    int updateAuthor(Author author,String password);
}
