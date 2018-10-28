package com.cd.dao;

import com.cd.beans.Student;
import com.cd.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

public class StudentDaoImpl implements IStudentDao {
    private SqlSession sqlSession;
    @Override
    public void insertStu(Student student) {
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.insert("insertStudent",student);
//            sqlSession.insert("reyco.insertStudent",student);
            sqlSession.commit();
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
