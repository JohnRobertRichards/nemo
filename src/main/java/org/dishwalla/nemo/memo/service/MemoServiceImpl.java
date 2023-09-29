package org.dishwalla.nemo.memo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.dishwalla.nemo.memo.dao.MemoDao;
import org.dishwalla.nemo.memo.domain.TodoVo;

@Service
public class MemoServiceImpl implements MemoService {

    @Autowired
    private MemoDao memoDao;

    @Override
    public List<TodoVo> list() {
        return memoDao.selectAll();
    }

    @Override
    public int remove(TodoVo todoVo) {
        return memoDao.delete(todoVo);
    }

    @Override
    public int register(TodoVo todoVo) {
        return memoDao.insert(todoVo);
    }

}
