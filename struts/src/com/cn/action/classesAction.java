package com.cn.action;
import com.alibaba.fastjson.JSON;
import com.cn.demo.classes;

/**
 * Created by Administrator on 2017/8/26.
 */
public class classesAction {
    private classes classes;
    private String username;
    private String password;
    public classes getClasses() {
        return classes;
    }

    public void setClasses(classes classes) {
        this.classes = classes;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String query(){
        String text = JSON.toJSONString(classes);//将前台的数据转换为JSON
        System.out.println(text);
        classes classess = (classes) JSON.parseObject(text,classes.getClass());//将JSON数据转换为JavaBean
        System.out.println(classes.getClassesName());
        return "success";
    }

}
