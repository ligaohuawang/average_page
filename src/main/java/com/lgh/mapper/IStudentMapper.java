package com.lgh.mapper;

import com.lgh.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IStudentMapper {

    int selectCount();

    List<Student> selectList(@Param("startIndex") int startIndex,@Param("pageSize") int pageSize);
}
