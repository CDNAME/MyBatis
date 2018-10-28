package com.cd.test;

import com.cd.beans.Student;
import com.cd.dao.IStudentDao;
import com.cd.dao.StudentDaoImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class MyTest {
    private IStudentDao dao;

    @Before
    public void before() {
        dao = new StudentDaoImpl();
    }

    @Test
    public void testInsert() {
        Student student = new Student("王二", 23, 90.5);
        System.out.println("插入前：student = " + student);
        dao.insertStudent(student);
        System.out.println("插入后：student = " + student);
    }

    @Test
    public void testInsertCacheId() {
        Student student = new Student("王二", 23, 90.5);
        System.out.println("插入前：student = " + student);
        dao.insertStudentCacheId(student);
        System.out.println("插入后：student = " + student);
    }

    @Test
    public void testDeleteStudentById() {
        int id = 44;
        dao.deleteStudentById(id);
    }

    @Test
    public void testUpdateStudent() {
        Student student = new Student("李四", 23, 90.5);
        student.setId(25);
        dao.updateStudent(student);
    }

    @Test
    public void testselectAllStudents() {
        List<Student> students = dao.selectAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void testselectAllStudentsMap() {
        Map<String, Object> map = dao.selectAllStudentsMap();
        System.out.println(map.get("张三"));
    }
    @Test
    public void testselectStudentById() {
        Student student = dao.selectStudentById(25);
        System.out.println(student);
    }
    @Test
    public void testselectStudentsByName() {
        List<Student> students = dao.selectStudentsByName("王");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
