package com.sanz.workbench.dao;

import com.sanz.workbench.model.MeTask;
import java.util.List;

public interface MeTaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MeTask record);

    MeTask selectByPrimaryKey(Integer id);

    List<MeTask> selectAll();

    int updateByPrimaryKey(MeTask record);
}