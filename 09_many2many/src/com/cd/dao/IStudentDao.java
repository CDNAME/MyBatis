package com.cd.dao;

import com.cd.beans.Student;

public interface IStudentDao {
    Student selectStudentById(int sid);
}
