package collegedreamersdemo.demo.controllers;


import collegedreamersdemo.demo.models.Post;
import collegedreamersdemo.demo.services.NotificationService;
import collegedreamersdemo.demo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static java.util.stream.Collectors.*;

@Controller
public class HomeController {

    @Autowired
    private PostService postService;

    @Autowired
    private NotificationService notificationService;

    @RequestMapping("/")
    public String home(Model model) {
        List<Post> latest5Posts = postService.findLatest5();
        model.addAttribute("latest5posts", latest5Posts);

        List<Post> latest3Posts = latest5Posts.stream()
                .limit(3).collect(toList());
        model.addAttribute("latest3posts", latest3Posts);

        return "index";
    }


}
