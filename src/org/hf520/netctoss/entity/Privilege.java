package org.hf520.netctoss.entity;

import java.util.List;

/**
 * Created by kevin on 2015/1/7.
 * 根据privileges.xml定义的实体类
 * ...
 */
public class Privilege {
    private String id;
    private String name;
    private List<String> urls;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }
}
