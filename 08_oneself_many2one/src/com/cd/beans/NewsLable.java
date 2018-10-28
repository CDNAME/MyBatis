package com.cd.beans;

import java.util.Set;

//新闻栏目：当前的新闻栏目被看做多方，即子栏目
public class NewsLable {
    private Integer id;
    private String name;    //栏目名称
    private NewsLable parent;   //父栏目
//    private Set<NewsLable> children;    //子栏目

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NewsLable getParent() {
        return parent;
    }

    public void setParent(NewsLable parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "NewsLable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parent=" + parent +
                '}';
    }
}
