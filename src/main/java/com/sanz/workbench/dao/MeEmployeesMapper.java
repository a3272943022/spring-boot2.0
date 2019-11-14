package com.sanz.workbench.dao;

import com.sanz.workbench.model.MeEmployees;
import java.util.List;

public interface MeEmployeesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MeEmployees record);

    MeEmployees selectByPrimaryKey(Long id);

    List<MeEmployees> selectAll();

    int updateByPrimaryKey(MeEmployees record);
}