package site.buzhou.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import site.buzhou.entity.Administrator;

/**
 * @program: Jifry
 * @description: /
 * @author: 不周
 * @create: 2020-12-10 11:48
 **/
@Mapper
@Repository
public interface AdminDao {
    Administrator findByUsernameAndPassword(String username, String password);
}
