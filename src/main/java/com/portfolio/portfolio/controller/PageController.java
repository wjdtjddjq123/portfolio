package com.portfolio.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/works")
    public String works() {
        return "pages/works";
    }

    @GetMapping("/company")
    public String company() {
        return "pages/company";
    }

    @GetMapping("/tools")
    public String tools() {
        return "pages/tools";
    }
}