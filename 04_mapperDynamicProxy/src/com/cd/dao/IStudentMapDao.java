package com.cd.dao;

import com.cd.beans.Student;

import java.util.List;
import java.util.Map;

public interface IStudentMapDao {
    List<Student> selectStudentsByCondition(Map<String, Object> map);
//    List<Student> selectStudentsByCondition(Student student);
}    
