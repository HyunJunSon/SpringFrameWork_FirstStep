package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("hello")
public class HelloModelController {

    @GetMapping("model")
    public String helloView(Model model) {
        model.addAttribute("msg", "타임리프!!");
        model.addAttribute("mb", new MB(1234,"Son"));
        model.addAttribute("list", List.of("동","서","남","북"));
        model.addAttribute("map", Map.of("kim",new MB(1234,"kimHyunJun"),"son",new MB(2345, "SonHyunJun")));
        model.addAttribute("members",
                List.of(new MB(1,"son"),
                        new MB(2,"choi"),
                        new MB(3,"koo"),
                        new MB(4,"mun")
                ));

        return "Test";
    }
}
