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

    @After
    public void after() {
        if(sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void testselectStudentById() {
        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(IStudentDao.class);
        
        Student student = dao.selectStudentById2(25);
        System.out.println(student);

        sqlSession.close();

        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(IStudentDao.class);
        
        Student student2 = dao.selectStudentById2(25);
        System.out.println(student2);
    }
    @Test
    public void testselectStudentById2() {
        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(IStudentDao.class);
        
        Student student = dao.selectStudentById2(25);
        System.out.println(student);

        sqlSession.close();

        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(IStudentDao.class);
        
        dao.insertStudent(new Student("",0,0));
        
        Student student2 = dao.selectStudentById2(25);
        System.out.println(student2);
    }
}
