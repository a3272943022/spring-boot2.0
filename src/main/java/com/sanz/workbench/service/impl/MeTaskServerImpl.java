package com.sanz.workbench.service.impl;

import com.sanz.workbench.dao.MeTaskMapper;
import com.sanz.workbench.service.MeTaskServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: key
 * @DATE: 2019/11/14 13 : 56
 * @CLASSNAME MeTaskServerImpl
 */
@Service
public class MeTaskServerImpl implements MeTaskServer {
@Autowired
    private MeTaskMapper meTaskMapper;
}
