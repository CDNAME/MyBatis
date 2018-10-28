package com.cd.beans;

import java.util.Set;

//新闻栏目：当前的新闻栏目被看做一方，即父栏目
public class NewsLable {
    private Integer id;
    private String name;
    private Set<NewsLable> children;

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

    public Set<NewsLable> getChildren() {
        return children;
    }

    public void setChildren(Set<NewsLable> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "NewsLable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
