package com.bw.controller;

import com.bw.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productType")
@CrossOrigin
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @RequestMapping("/productTypeList")
    public List productTypeList(){
        return productTypeService.getList();
    }

}
