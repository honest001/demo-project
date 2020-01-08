package com.example.demo.project.mapper;

import com.example.demo.project.base.mapper.BaseMapper;
import com.example.demo.project.model.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends BaseMapper<User> {
    User getById(Long userId);
}
