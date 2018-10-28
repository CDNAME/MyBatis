package com.cd.dao;

import com.cd.beans.Student;

import java.util.List;
import java.util.Map;

public interface IStudentDao {
    void insertStudent(Student student);
    
    Student selectStudentById(int id);
    Student selectStudentById2(int id);
}    
