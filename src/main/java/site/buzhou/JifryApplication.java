package site.buzhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: Jifry
 * @description: to start the Jifry
 * @author: 不周
 * @create: 2020-12-09 21:10
 **/

@SpringBootApplication(scanBasePackages="site.buzhou.*")
public class JifryApplication {
    public static void main(String[] args) {
        SpringApplication.run(JifryApplication.class, args);
    }
}
