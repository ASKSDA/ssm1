package com.example.ssm1.mapper;

import com.example.ssm1.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
    List<User> findAll();
    User findOne(Integer id);
    int save(User user);
    int deleteById(Integer id);
    int updateById(User user);

}
