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

    //证明一级缓存是存在的
    @Test
    public void testselectStudentById() {
        Student student = dao.selectStudentById(25);
        System.out.println(student);
        Student student2 = dao.selectStudentById(25);
        System.out.println(student2);
    }
    /*
     * 缓存的底层实现是一个Map,Map的value是查询结果
     *  Map的key，即查询的依据，使用的ORM架构不同，查询的依据也是不同的
     *  MaBatis的查询依据是：  sql的id + SQL语句
     *  Hibernate的查询依据是：查询结果对象的id
     */
    @Test
    public void testselectStudentById2() {
        Student student = dao.selectStudentById(25);
        System.out.println(student);
        Student student2 = dao.selectStudentById2(25);
        System.out.println(student2);
    }
    
    @Test
    public void testinsertStudent() {
        Student student = dao.selectStudentById(25);
        System.out.println(student);
        
        //增删改操作都会清空（刷新）一级缓存，无论是否提交
        dao.insertStudent(new Student("赵六",25,90.5));
        //sqlSession.commit();

        Student student2 = dao.selectStudentById(25);
        System.out.println(student2);
    }
}
