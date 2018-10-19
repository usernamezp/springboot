package com.baizhi.springboot.service.impl;

import com.baizhi.springboot.dao.StudentDao;
import com.baizhi.springboot.entity.Student;
import com.baizhi.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao dao;

    public List<Student> selectAll() {
//        System.out.println("进入serviceimpl方法。。。。。。。。。。。");
        List<Student> students = dao.selectAll();
//        System.out.println("走出serviceimpl方法++++++++++++++++++++++++++++++。。。。。。。。。。。");
        return students;
    }

    public Student selectOne(int id) {
        return dao.selectOne(id);
    }

    public void update(Student student) {
        dao.update(student);
    }

    public void delete(int id) {
        dao.delete(id);
    }

    public void insert(Student student) {
        dao.insert(student);
    }
}
