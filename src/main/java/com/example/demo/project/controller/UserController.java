package com.example.demo.project.controller;


import com.example.demo.project.dto.UserDto;
import com.example.demo.project.model.User;
import com.example.demo.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    private UserService userService;

   /**
     * 添加用户
     * @param userDto
     * @return
     */
    @PostMapping("/add")
    public User addUser(@RequestBody UserDto userDto){
        return userService.insert(userDto);
    }

    /**
     * 查询用户
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public User selectUser(@PathVariable("userId") Long userId){
        User user=userService.selectById(userId);
        System.out.println("sucess");
        return user;
    }
    /**
     * 更新用户
     * @param userDto
     * @return
     */
    @PostMapping("/update")
    public Integer updateUser(@RequestBody UserDto userDto){
        return userService.update(userDto);
    }

    /**
     * 删除用户
     * @param userId
     * @return
     */
    @PutMapping("/delete/{userId}")
    public Integer delete(@PathVariable("userId") Long userId){
        return userService.delete(userId);
    }

    @GetMapping("/list")
    public Object list(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "20") Integer size,@RequestParam("userName") String userName){
        return userService.list(page,size,userName);
    }

}
