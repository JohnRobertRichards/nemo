package org.dishwalla.nemo.memo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemoViewController {

    @GetMapping("/")
    public String view() {
        return "index.html";
    }
}
