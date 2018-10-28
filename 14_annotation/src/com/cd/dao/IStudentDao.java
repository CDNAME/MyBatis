package com.cd.dao;

import com.cd.beans.Student;
import org.apache.ibatis.annotations.*;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public interface IStudentDao {
    @Insert(value={"insert into student(name, age, score) values(#{name},#{age},#{score})"})
    void insertStudent(Student student);
    
    @Insert("insert into student(name, age, score) values(#{name},#{age},#{score})")
    @SelectKey(statement="select @@identity", resultType=int.class, keyProperty="id", before=false)
    void insertStudentCacheId(Student student);
    
    @Delete(value="delete from student where id=#{value}")
    void deleteStudentById(int id);
    
    @Update("update student set name=#{name}, age=#{age}, score=#{score} where id=#{id}")
    void updateStudent(Student student);

    @Select("select id,name,age,score from student")
    List<Student> selectAllStudents();

    @Select("select id,name,age,score from student where id=#{id}")
    Student selectStudentById(int id);
    
    @Select("select id,name,age,score from student where name like '%' #{name} '%'")
    List<Student> selectStudentsByName(String name);

}    
