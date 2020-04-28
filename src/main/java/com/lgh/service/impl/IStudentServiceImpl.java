package com.lgh.service.impl;

import com.lgh.dao.IStudentDao;
import com.lgh.entity.Page;
import com.lgh.entity.Student;
import com.lgh.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IStudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDao iStudentDao;

    //TODO A3 service的实现类中先查询数据总条数，再查询要返回给前端的记录数
    @Override
    public Page selectStudentPage(Page page) {
    //1.先查询总记录数
        int total = iStudentDao.selectCount();
        //2.根据传进来的 每页显示多少条 和 查询出来的 总记录数 求 总页数
        int pageSize=total%page.getPageSize()==0?total/page.getPageSize():total/page.getPageSize()+1;
        //3.查询本次查询要展示的数据
        List<Student> studentList = iStudentDao.selectList((page.getCurrentPage()-1)*page.getPageSize(), page.getPageSize());
        page.setList(studentList);
        page.setTotalPage(pageSize);
        page.setTotal(total);
        return page;
    }
}
