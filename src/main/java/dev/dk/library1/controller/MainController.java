package dev.dk.library1.controller;

import dev.dk.library1.service.LibraryService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@MapperScan("dev.dk.library1.Mapper")
@Controller
@RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
public class MainController {

    @Autowired
    LibraryService libraryService;


    @GetMapping("hello")
    @PostMapping("")
    public String hello(Model model) {

        System.out.println("GET 방식 request try");

        String view_text = libraryService.getViewText();

        model.addAttribute("view_text", view_text);

        return "index";

    }
}
