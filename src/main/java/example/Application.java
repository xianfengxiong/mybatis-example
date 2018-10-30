package example;

import example.dao.UserMapper;
import example.model.User;
import example.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

/**
 * @author xxf
 * @since 2018/10/30
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired private UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<User> users = userMapper.selectByExample(new UserExample());
        System.out.println(users.size());
    }
}
