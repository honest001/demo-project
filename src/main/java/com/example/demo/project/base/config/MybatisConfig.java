package com.example.demo.project.base.config;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author shanjigang
 * @date 2018/6/3 17:19
 */
@Configuration
@MapperScan("com.example.demo.project.mapper")
public class MybatisConfig {
}
