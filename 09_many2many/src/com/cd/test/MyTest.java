package com.cd.test;

import com.cd.beans.Student;
import com.cd.dao.IStudentDao;
import com.cd.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyTest {
    private IStudentDao dao;
    private SqlSession sqlSession;

    @Before
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(IStudentDao.class);
    }

    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void testselectStudentById() {
        Student student= dao.selectStudentById(1);
        System.out.println(student);
    }

}