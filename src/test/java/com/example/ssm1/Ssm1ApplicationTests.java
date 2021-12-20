package com.example.ssm1;

import com.example.ssm1.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ssm1ApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        userMapper.findAll().forEach(System.out::println);
    }


}
