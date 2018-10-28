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

    /*
     * 证明二级缓存是存在的
     *  开启内置的二级缓存步骤：
     *  1）对实体进行序列化
     *  2) 在映射文件mapper中加入标签<cache/>
     */ 
    @Test
    public void testselectStudentById() {
        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(IStudentDao.class);
        
        Student student = dao.selectStudentById(25);
        System.out.println(student);

        sqlSession.close();

        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(IStudentDao.class);
        
        Student student2 = dao.selectStudentById(25);
        System.out.println(student2);
    }
    
    /*
    *   本例说明以下几点内容：
    *   1.增删改同样也会清空二级缓存
    *   2.对于二级缓存的清空，实质上是对所查找的key对应的value置为null，
    *       而并非将Map<key, value>对，即Entry对象删除
    *   3.从DB中进行select查询的条件是：
    *       1）缓存中根本就不存在这个key
    *       2）缓存中存在该key所对应的Entry对象，但其value为null
    * 
     */
    @Test
    public void testselectStudentById2() {
        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(IStudentDao.class);
        
        Student student = dao.selectStudentById(25);
        System.out.println(student);

        sqlSession.close();

        sqlSession = MyBatisUtils.getSqlSession();
        dao = sqlSession.getMapper(IStudentDao.class);
        
        //插入数据
        dao.insertStudent(new Student("",0,0));
        
        Student student2 = dao.selectStudentById(25);
        System.out.println(student2);
    }
}
