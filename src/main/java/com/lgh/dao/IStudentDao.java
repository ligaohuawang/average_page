package com.lgh.dao;

import com.lgh.entity.Page;
import com.lgh.entity.Student;

import java.util.List;

public interface IStudentDao {
   //TODO A4 查询总记录数的方法
    int selectCount();
    // TODO A5 查询分页集合数据的方法
    List<Student> selectList(int startIndex,int pageSize);
}
