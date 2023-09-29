package org.dishwalla.nemo.login.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.dishwalla.nemo.login.domain.UserVo;

@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String login() {
        return "login.html";
    }
    
    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody UserVo user, HttpSession session) {
        String sessionId = "s1";
        String username = "son";
        
        if (user.getUsername().equals("logout")) {
            session.removeAttribute("sessionId");
            return "logout";
        }
        
        if (!user.getUsername().equals(username)) {
            return "login failed";
        }
        
        session.setAttribute("sessionId", sessionId);
        return "login success";
    }
}
