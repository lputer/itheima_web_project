package com.example.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpMapper {
    // 根据id删除数据
    @Delete("delete from emp where id = #{id}")
    public int delete(Integer id);
}
