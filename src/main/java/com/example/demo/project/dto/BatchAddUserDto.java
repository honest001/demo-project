package com.example.demo.project.dto;

import lombok.Data;

import java.util.List;

@Data
public class BatchAddUserDto {
    private List<UserDto> addUserList;
}
