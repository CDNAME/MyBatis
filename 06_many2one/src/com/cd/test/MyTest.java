package com.cd.test;

import com.cd.beans.Country;
import com.cd.beans.Minister;
import com.cd.dao.IMinisterDao;
import com.cd.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyTest {
    private IMinisterDao dao;
    private SqlSession sqlSession;

    @Before
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(IMinisterDao.class);
    }
    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
    
    @Test
    public void testselectCountryById() {
        Minister minister = dao.selectMinisterById(2);
        System.out.println(minister);
    }
    @Test
    public void testselectMinister2CountryById() {
        Minister minister = dao.selectMinister2CountryById(2);
        System.out.println(minister);
    }
}
