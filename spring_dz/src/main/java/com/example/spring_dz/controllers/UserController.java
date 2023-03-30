package com.example.spring_dz.controllers;


import com.example.spring_dz.repository.models.User;
import com.example.spring_dz.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @GetMapping("/users/new")
    public String createUserForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "create_user";
    }

    @PostMapping("/users")
    public String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/users";
    }



//    @GetMapping("/") //@GetMapping("/greeting") url путь якшо просто "/" то це головна сторінка | обработка сторінки
//    public String home(Model model) {// функція шо має стати якшо передає на дану сторінку
//        model.addAttribute("title", "Головна сторінка");
//        return "home";// назва файла html коду | шаблон
//    }

}