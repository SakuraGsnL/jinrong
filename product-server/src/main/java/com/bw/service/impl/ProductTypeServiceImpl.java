package com.bw.service.impl;

import com.bw.mapper.ProductTypeMapper;
import com.bw.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeMapper productTypeMapper;

    @Override
    public List getList() {
        return productTypeMapper.getList();
    }
}
