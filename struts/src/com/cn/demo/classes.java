package com.cn.demo;

/**
 * Created by Administrator on 2017/8/26.
 */
public class classes {
    private String classesId;
    private String classesName;

    public String getClassesId() {
        return classesId;
    }

    public void setClassesId(String classesId) {
        this.classesId = classesId;
    }

    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName;
    }

    @Override
    public String toString() {
        return "classes{" +
                "classesId='" + classesId + '\'' +
                ", classesName='" + classesName + '\'' +
                '}';
    }
}
