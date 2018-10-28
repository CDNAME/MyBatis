package com.cd.test;

import com.cd.beans.Student;
import com.cd.dao.IStudentMapDao;
import com.cd.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMapTest {
    private IStudentMapDao dao;
    SqlSession sqlSession;

    @Before
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
        //dao为JDK的$Proxy4代理
        dao = sqlSession.getMapper(IStudentMapDao.class);
    }

    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void testselectStudentsByMap() {
        Student stu = new Student("王犯", 23, 90.5);
        
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("nameCon", "王");
        map.put("ageCon", 23);
        map.put("stu", stu);
        
        List<Student> students = dao.selectStudentsByCondition(map);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
