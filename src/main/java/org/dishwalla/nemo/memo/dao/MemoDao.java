package org.dishwalla.nemo.memo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.dishwalla.nemo.memo.domain.TodoVo;

@Mapper
public interface MemoDao {
    List<TodoVo> selectAll();

    int delete(TodoVo todoVo);

    int insert(TodoVo todoVo);
}
