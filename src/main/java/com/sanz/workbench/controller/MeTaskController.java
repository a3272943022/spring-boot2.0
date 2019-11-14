package com.sanz.workbench.controller;

import com.sanz.workbench.service.MeTaskServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: key
 * @DATE: 2019/11/14 13 : 56
 * @CLASSNAME MeTaskController
 */
@RestController
@RequestMapping(value = "")
public class MeTaskController {
    @Autowired
    private MeTaskServer meTaskServer;

    @RequestMapping(value = "/text")
    private Object get() {
        return "suss";
    }
}
