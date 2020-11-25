package PhoneStore.spring.controllers;

import PhoneStore.dataBase.models.User;
import PhoneStore.dataBase.services.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LoginController {

    final
    UserServiceImpl userService;

    public LoginController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String index(@ModelAttribute("user") User user) {
        return "login/login";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute("user") User user) {
        List<User> users = userService.findAllUsers();
        if (users.contains(user))
            return "home/home";
        else
            return "login/login";
    }

    @GetMapping("/signup")
    public String signupUser(@ModelAttribute("user") User user) {
        return "login/signup";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "home/home";
    }
}
