package org.dishwalla.nemo.memo.service;

import java.util.List;

import org.dishwalla.nemo.memo.domain.TodoVo;

public interface MemoService {
    List<TodoVo> list();

    int remove(TodoVo todoVo);

    int register(TodoVo todoVo);
}
