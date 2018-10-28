package com.cd.test;

import com.cd.beans.Student;
import com.cd.dao.IStudentConditionDao;
import com.cd.dao.IStudentDao;
import com.cd.dao.IStudentMapDao;
import com.cd.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyConditionTest {
    private IStudentConditionDao dao;
    SqlSession sqlSession;

    @Before
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
        //dao为JDK的$Proxy4代理
        dao = sqlSession.getMapper(IStudentConditionDao.class);
    }

    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void testselectStudentsByCondition() {
        List<Student> students = dao.selectStudentsByCondition("张", 22);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void testselectStudentsByIf() {
        Student stu = new Student("张", 23, 0);
//        Student stu = new Student("", 23, 0);
//        Student stu = new Student("", 0, 0);
        
        List<Student> students = dao.selectStudentsByIf(stu);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void testselectStudentsByWhere() {
        Student stu = new Student("张", 23, 0);
//        Student stu = new Student("", 23, 0);
//        Student stu = new Student("", 0, 0);

        List<Student> students = dao.selectStudentsByWhere(stu);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void testselectStudentsByChoose() {
//        Student stu = new Student("张", 23, 0);
//        Student stu = new Student("", 23, 0);
        Student stu = new Student("", 0, 0);

        List<Student> students = dao.selectStudentsByChoose(stu);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void testselectStudentsByForeach() {
        int[] ids = {1,2,3};
        
        List<Student> students = dao.selectStudentsByForeach(ids);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void testselectStudentsByForeachList() {
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        
        List<Student> students = dao.selectStudentsByForeachList(ids);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void testselectStudentsByForeachGenerics() {
        Student stu1 = new Student();
        stu1.setId(1);
        Student stu2 = new Student();
        stu2.setId(2);
        
        List<Student> stus = new ArrayList<Student>();
        stus.add(stu1);
        stus.add(stu2);
        
        List<Student> students = dao.selectStudentsByForeachGenerics(stus);
        for (Student student : students) {
            System.out.println(student);
        }
    }@Test
    public void testselectStudentsBySqlFragment() {
        Student stu1 = new Student();
        stu1.setId(1);
        Student stu2 = new Student();
        stu2.setId(2);

        List<Student> stus = new ArrayList<Student>();
        stus.add(stu1);
        stus.add(stu2);

        List<Student> students = dao.selectStudentsBySqlFragment(stus);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
