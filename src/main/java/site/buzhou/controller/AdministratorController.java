package site.buzhou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import site.buzhou.entity.Administrator;
import site.buzhou.service.AdminService;
import site.buzhou.utils.MD5Utils;

import javax.servlet.http.HttpSession;

/**
 * @program: Jifry
 * @description: /
 * @author: 不周
 * @create: 2020-12-09 21:26
 **/
@Controller
@RequestMapping("/admin")
public class AdministratorController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public String loginPage(){
        return "admin/admin";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        RedirectAttributes attributes) {
//        Administrator administrator = adminService.checkUser(username, MD5Utils.code(password));
        //如有需要可以进行MD５加密
        Administrator administrator = adminService.checkUser(username, password);
        if (administrator != null) {
            administrator.setPassword(null);
            session.setAttribute("user",administrator);
            return "admin/index";
        } else {
            attributes.addFlashAttribute("message", "用户名和密码错误");
            return "redirect:/admin";

        }
    }

}
