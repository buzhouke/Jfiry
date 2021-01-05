package site.buzhou.service;

import org.springframework.stereotype.Service;
import site.buzhou.entity.Administrator;


public interface AdminService {
    Administrator checkUser(String username, String password);

    int addAdmin(Administrator administrator);
}
