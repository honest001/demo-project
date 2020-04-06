package com.example.demo.project.service.impl;

import com.example.demo.project.dto.BatchAddUserDto;
import com.example.demo.project.dto.UserDto;
import com.example.demo.project.mapper.UserMapper;
import com.example.demo.project.model.User;
import com.example.demo.project.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User insert(UserDto userDto){
        User user=new User();
        user.setUserName(userDto.getUserName());
        user.setPassword(userDto.getPassword());
        user.setGmtCreate(new Date());
        user.setStatus(0);
        userMapper.insertSelective(user);

        return user;
    }

    public User selectById(Long userId){
        User user=userMapper.selectByPrimaryKey(userId);
        return user;
    }

    public Integer update(UserDto userDto){
        User user=new User();
        user.setId(userDto.getUserId());
        user.setUserName(userDto.getUserName());
        user.setPassword(userDto.getPassword());
        user.setGmtCreate(new Date());

        return userMapper.updateByPrimaryKeySelective(user);
    }

    public Integer delete(Long userId){
        User user=userMapper.selectByPrimaryKey(userId);
        if(user!=null){
            user.setStatus(1);
            user.setGmtModified(new Date());

            return userMapper.updateByPrimaryKeySelective(user);
        }

        return 0;
    }

    public PageInfo<User> list(Integer page, Integer size, String userName){
        Example example=new Example(User.class);
        example.and().andEqualTo("status",0);
        if(Strings.isNotEmpty(userName)){
            example.and().andLike("userName","%"+userName+"%");
        }

        PageInfo<User> pageInfo=PageHelper.startPage(page,size).doSelectPageInfo(()->userMapper.selectByExample(example));

        return pageInfo;
    }

    public List<User> BatchAddUser(BatchAddUserDto batchAddUserDto){
        List<User> userList= new ArrayList<>();
        if(!CollectionUtils.isEmpty(batchAddUserDto.getAddUserList())){
            batchAddUserDto.getAddUserList().forEach(userDto->{
                User user=new User();
                BeanUtils.copyProperties(userDto,user);
                userList.add(user);
            });
            userMapper.insertList(userList);
        }
        return userList;
    }
}
