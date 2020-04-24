package com.bw.service.impl;

import com.bw.mapper.TestMapper;
import com.bw.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List getList() {
        return testMapper.getList();
    }
}
