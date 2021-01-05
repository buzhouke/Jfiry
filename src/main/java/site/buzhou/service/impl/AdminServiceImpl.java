package site.buzhou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.buzhou.dao.AdminDao;
import site.buzhou.entity.Administrator;
import site.buzhou.utils.MD5Utils;

/**
 * @program: Jifry
 * @description: the implementation for admin
 * @author: 不周
 * @create: 2020-12-10 11:44
 **/
@Service
public class AdminServiceImpl implements site.buzhou.service.AdminService {
    @Autowired
    AdminDao adminDao;

    @Override
    public Administrator checkUser(String username, String password) {
//        Administrator administrator = adminDao.findByUsernameAndPassword(username, MD5Utils.code(password));
        Administrator administrator = adminDao.findByUsernameAndPassword(username, password);
        return administrator;
    }

    @Override
    public int addAdmin(Administrator administrator) {
        return 0;
    }
}
