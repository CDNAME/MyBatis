package com.cd.dao;

import com.cd.beans.Student;
import com.cd.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDaoImpl implements IStudentDao {
    private SqlSession sqlSession;
    @Override
    public void insertStudent(Student student) {
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.insert("insertStudent",student);
            sqlSession.commit();
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Override
    public void insertStudentCacheId(Student student) {
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.insert("insertStudentCacheId",student);
            sqlSession.commit();
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Override
    public List<Student> selectAllStudents() {
        List<Student> students = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            students = sqlSession.selectList("selectAllStudents");
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
        return students;
    }
    

    @Override
    public Student selectStudentById(int id) {
        Student student = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            student = sqlSession.selectOne("selectStudentById", id);
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
        return student;
    }

    @Override
    public List<Student> selectStudentsByName(String name) {
        List<Student> students = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            students = sqlSession.selectList("selectStudentsByName", name);
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
        return students;
    }
}
