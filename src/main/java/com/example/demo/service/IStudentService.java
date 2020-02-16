package com.example.demo.service;

import com.example.demo.entity.Student;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * @author : leilei
 * @date : 10:29 2020/2/16
 * @desc :
 */
public interface IStudentService {
    int insertStudent(Student student);

    int updateStudent(Student student);

    int removeStudent(Long id);

    Student findOne(Student student);

    List<Student> findlike(Student student);

    List<Student> findmore(Student student);

    List<Student> findtime(Student student);

    List<Student> findtimeByPage(Student student);

}
