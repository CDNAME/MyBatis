package com.cd.dao;

import com.cd.beans.NewsLable;

import java.util.List;

public interface INewsLableDao {
    List<NewsLable> selectChildrenByParent(int pid);
    NewsLable selectNewsLableById(int id);
}
