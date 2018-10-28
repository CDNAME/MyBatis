package com.cd.test;

import com.cd.beans.Student;
import com.cd.dao.IStudentDao;
import com.cd.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class MyTest {
    private IStudentDao dao;
    SqlSession sqlSession;

    @Before
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
        //dao为JDK的$Proxy4代理
        dao = sqlSession.getMapper(IStudentDao.class);
    }
    
    @After
    public void after() {
        if(sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void testInsert() {
        Student student = new Student("王二", 23, 90.5);
        System.out.println("插入前：student = " + student);
        dao.insertStudent(student);
        System.out.println("插入后：student = " + student);
        sqlSession.commit();
    }

    @Test
    public void testInsertCacheId() {
        Student student = new Student("王二", 23, 90.5);
        System.out.println("插入前：student = " + student);
        dao.insertStudentCacheId(student);
        System.out.println("插入后：student = " + student);
        sqlSession.commit();
    }

    @Test
    public void testDeleteStudentById() {
        int id = 44;
        dao.deleteStudentById(id);
        sqlSession.commit();
    }

    @Test
    public void testUpdateStudent() {
        Student student = new Student("李四", 23, 90.5);
        student.setId(25);
        dao.updateStudent(student);
        sqlSession.commit();
    }

    @Test
    public void testselectAllStudents() {
        List<Student> students = dao.selectAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }
    /*
    @Test
    public void testselectAllStudentsMap() {
        Map<String, Object> map = dao.selectAllStudentsMap();
        System.out.println(map.get("张三"));
    }*/
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
