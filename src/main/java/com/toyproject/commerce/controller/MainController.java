package com.toyproject.commerce.controller;

import com.toyproject.commerce.domain.Users;
import com.toyproject.commerce.service.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value="/commerce")
public class MainController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UsersService usersService;

    @GetMapping("saveTenThousand")
    public Users saveTenThousand(){
        usersService.saveTenThousand();
        return null;
    }


}
