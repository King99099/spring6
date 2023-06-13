package com.atguigu.spring.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * ClassName:Employee
 * Package: com.atguigu.spring.bean
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/16 - 14:09
 * @Version: v1.0
 */
public class Employee {
    private Department dept;
    private String name;
    private Integer id;

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    private Map<String,Teacher> teacherMap;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    private List<Employee> employeeList;

    private String[] hobbies;

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public void work(){
        System.out.println(name + ":正在工作,工号是:" + id );
        dept.deptInfo();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept=" + dept +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", teacherMap=" + teacherMap +
                ", employeeList=" + employeeList +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
