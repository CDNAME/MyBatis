package com.cd.test;

import com.cd.beans.Student;
import com.cd.dao.IStudentDao;
import com.cd.dao.StudentDaoImpl;
import org.junit.Before;
import org.junit.Test;

public class MyTest {
    private IStudentDao dao;
    @Before
    public void before() {
        dao = new StudentDaoImpl();
    }
    @Test
    public void testInsert() {
        Student student = new Student("王二",23,90.5);
        dao.insertStu(student);
    }
}
