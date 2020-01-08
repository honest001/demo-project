package com.example.demo.project.service;


import com.example.demo.project.dto.UserDto;
import com.example.demo.project.model.User;
import com.github.pagehelper.PageInfo;

public interface UserService {
  /**
     * 添加用户
     * @param userDto
     * @return
     */
    User insert(UserDto userDto);

    /**
     * 查询用户
     * @param userId
     * @return
     */
    User selectById(Long userId);

    /**
     * 更新用户
     * @param userDto
     * @return
     */
    Integer update(UserDto userDto);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    Integer delete(Long userId);

    /**
     * 用户列表
     * @param page
     * @param size
     * @param userName
     * @return
     */
    PageInfo<User> list(Integer page, Integer size, String userName);

}
