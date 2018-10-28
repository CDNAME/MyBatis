package com.cd.test;

import com.cd.beans.Country;
import com.cd.dao.ICountryDao;
import com.cd.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyTest {
    private ICountryDao dao;
    private SqlSession sqlSession;

    @Before
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(ICountryDao.class);
    }
    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
    
    @Test
    public void testselectCountryById() {
        Country country = dao.selectCountryById(2);
        System.out.println(country);
    }
    @Test
    public void testselectCountry2MinisterById() {
        Country country = dao.selectCountry2MinisterById(1);
        System.out.println(country);
    }

}
