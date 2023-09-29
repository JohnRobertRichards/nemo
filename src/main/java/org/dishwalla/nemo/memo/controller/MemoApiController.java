package org.dishwalla.nemo.memo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.dishwalla.nemo.memo.domain.TodoVo;
import org.dishwalla.nemo.memo.service.MemoService;

@RestController
public class MemoApiController {

    @Autowired
    private MemoService memoService;

    @GetMapping("/list")
    public List<TodoVo> list() {
        return memoService.list();
    }
    
    @PostMapping("/register")
    public int register(@RequestBody TodoVo todoVo) {
        return memoService.register(todoVo);
    }

    @PostMapping("/remove")
    public void del(@RequestBody TodoVo todoVo) {
        memoService.remove(todoVo);
    }

}
