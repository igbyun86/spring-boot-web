package com.ig.springbootweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping({"/", "/hello"})
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="ig") String name) {
        model.addAttribute("message", "hello freemarker!");
        model.addAttribute("name", name);

        return "hello";
    }
}
