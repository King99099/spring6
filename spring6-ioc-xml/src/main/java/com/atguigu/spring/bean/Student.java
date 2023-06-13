package com.atguigu.spring.bean;

import java.util.Arrays;
import java.util.Map;

/**
 * ClassName:Student
 * Package: com.atguigu.spring.bean
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/17 - 17:53
 * @Version: v1.0
 */
public class Student {
    private String id;
    private String name;
    private String age;

    private String[] hobbes;

    private Map<String, Teacher> teacherMap;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String[] getHobbes() {
        return hobbes;
    }

    public void setHobbes(String[] hobbes) {
        this.hobbes = hobbes;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", hobbes=" + Arrays.toString(hobbes) +
                ", teacherMap=" + teacherMap +
                '}';
    }
}
