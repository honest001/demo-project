package com.example.demo.project.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 用户Dto
 */
@Data
public class UserDto {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    @NotBlank
    private String userName;

    /**
     * 密码
     */
    @NotBlank
    private String password;

}
