package com.bw.controller;

import com.bw.common.Result;
import com.bw.pojo.Users;
import com.bw.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.bw.common.CodeMsg.LOGIN_NAMEORPASSWORDERROR;

@RequestMapping("/login")
@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public Result login(@RequestBody Users users){
        Users user = loginService.login(users);
        if (user==null) return Result.fail(LOGIN_NAMEORPASSWORDERROR);
        return Result.success(user);
    }

}
