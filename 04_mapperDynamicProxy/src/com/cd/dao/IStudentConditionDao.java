package com.cd.dao;

import com.cd.beans.Student;

import java.util.List;
import java.util.Map;

public interface IStudentConditionDao {
    List<Student> selectStudentsByCondition(String name, int age);
    List<Student> selectStudentsByIf(Student student);
    List<Student> selectStudentsByWhere(Student student);
    List<Student> selectStudentsByChoose(Student student);
    List<Student> selectStudentsByForeach(int[] ids);
    List<Student> selectStudentsByForeachList(List<Integer> ids);
    List<Student> selectStudentsByForeachGenerics(List<Student> ids);
    List<Student> selectStudentsBySqlFragment(List<Student> ids);
}    
