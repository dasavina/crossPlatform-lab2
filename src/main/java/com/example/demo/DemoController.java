package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
@Controller
@RequestMapping("/")
public class DemoController {
    @GetMapping
    public String index(Model model) {
        User user = new User("Daria", "ua", true, "some description here...");
        model.addAttribute("pageTitle", " Spring!");
        model.addAttribute("languages", List.of("Java", "C#", "C++"));

        model.addAttribute("username", user.login);

        user.friends.put(1, "anon1");
        user.friends.put(2, "user2");

        model.addAttribute("friendsList", user.friends);
        model.addAttribute("numberOfFriends", user.friends.size());


        model.addAttribute("User", user);

        model.addAttribute("additional", 2);
        model.addAttribute("farewell", "goodbye");



        return "index";
    }
}