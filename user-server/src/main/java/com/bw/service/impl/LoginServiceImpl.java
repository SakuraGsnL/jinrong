package com.bw.service.impl;

import com.bw.mapper.LoginMapper;
import com.bw.pojo.Users;
import com.bw.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Users login(Users users) {
        return loginMapper.login(users);
    }
}
