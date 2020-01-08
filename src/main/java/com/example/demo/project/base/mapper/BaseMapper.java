package com.example.demo.project.base.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * 基础Mapper
 * 
 * @author sjg
 *
 */
public interface  BaseMapper<T> extends Mapper<T>, InsertListMapper<T> {

}
