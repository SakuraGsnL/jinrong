package com.bw.mapper;

import com.bw.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginMapper {
    Users login(@Param("users") Users users);
}
