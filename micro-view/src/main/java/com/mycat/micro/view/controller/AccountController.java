package com.mycat.micro.view.controller;

import com.mycat.micro.view.constant.ViewConstant;
import com.mycat.micro.view.model.Account;
import com.mycat.micro.view.service.AccountService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Desc:
 *
 * @date: 25/06/2017
 * @author: gaozhiwen
 */
@Controller
public class AccountController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountService accountService;

    @PostMapping("/login")
    public String login(String username, String password, HttpServletRequest request) {
        LOGGER.info("[login] param username: {}, password: {}", username, password);
        Account account = null;
//        try {
//            account = accountService.login(username, password);
//        }catch (RuntimeException e){
//            LOGGER.error("[login] account service login error, perhaps eureka error", e);
            account = new Account();
            account.setName("test");
            account.setPassword("test");
//        }
        LOGGER.info("[login] response from account service, account: " + account);
        request.getSession().setAttribute("test", account.getName());
        if (account == null) {
            return "index";
        } else {
            request.getSession().setAttribute(ViewConstant.SESSION_KEY, account);
            return "welcome";
        }
    }
}
