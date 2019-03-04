package collegedreamersdemo.demo.controllers;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/index")
@Controller
public class IndexController {


    @GetMapping
    public String index() {



        return "index";
    }

    @PostMapping
    public String indexPost(){
        return "index";
    }




}
