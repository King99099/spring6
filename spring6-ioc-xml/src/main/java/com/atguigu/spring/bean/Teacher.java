package com.atguigu.spring.bean;

/**
 * ClassName:Teacher
 * Package: com.atguigu.spring.bean
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/17 - 17:30
 * @Version: v1.0
 */
public class Teacher {
    public String tName;
    public String tId;

    @Override
    public String toString() {
        return "Teacher{" +
                "tName='" + tName + '\'' +
                ", tId='" + tId + '\'' +
                '}';
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }
}
