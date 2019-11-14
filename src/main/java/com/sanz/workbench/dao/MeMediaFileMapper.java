package com.sanz.workbench.dao;

import com.sanz.workbench.model.MeMediaFile;
import java.util.List;

public interface MeMediaFileMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MeMediaFile record);

    MeMediaFile selectByPrimaryKey(Long id);

    List<MeMediaFile> selectAll();

    int updateByPrimaryKey(MeMediaFile record);
}