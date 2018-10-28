package com.cd.test;

import com.cd.beans.NewsLable;
import com.cd.dao.INewsLableDao;
import com.cd.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class MyTest {
    private INewsLableDao dao;
    private SqlSession sqlSession;

    @Before
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(INewsLableDao.class);
    }

    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void testselectNewsLableById() {
        NewsLable newsLable = dao.selectNewsLableById(7);
        System.out.println(newsLable);
    }

}