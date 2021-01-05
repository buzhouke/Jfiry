package site.buzhou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.buzhou.entity.Author;
import site.buzhou.service.UserService;

/**
 * @program: Jifry
 * @description:
 * @author: 不周
 * @create: 2020-12-10 15:20
 **/
@Service
public class UserServiceImpl implements UserService {


    @Override
    public Author checkAuthor(String username, String password) {
        return null;
    }

    @Override
    public int addAuthor(Author author) {
        return 0;
    }

    @Override
    public int deleteAuthor(Author author) {
        return 0;
    }

    @Override
    public int updateAuthor(Author author, String password) {
        return 0;
    }
}
