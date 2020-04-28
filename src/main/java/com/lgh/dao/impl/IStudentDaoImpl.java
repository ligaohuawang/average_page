package com.lgh.dao.impl;

import com.lgh.dao.IStudentDao;
import com.lgh.entity.Page;
import com.lgh.entity.Student;
import com.lgh.mapper.IStudentMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IStudentDaoImpl extends SqlSessionDaoSupport implements IStudentDao {

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int selectCount() {
        IStudentMapper iStudentMapper = getSqlSession().getMapper(IStudentMapper.class);
        int total = iStudentMapper.selectCount();
        return total;
    }

    @Override
    public List<Student> selectList(int startIndex, int pageSize) {
        IStudentMapper iStudentMapper = getSqlSession().getMapper(IStudentMapper.class);
        List<Student> studentList = iStudentMapper.selectList(startIndex, pageSize);
        return studentList;
    }
}
