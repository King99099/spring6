package com.atguigu.spring.bean;

import java.util.List;
import java.util.Map;

/**
 * ClassName:Depatment
 * Package: com.atguigu.spring.bean
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/16 - 14:09
 * @Version: v1.0
 */
public class Department {
    public List<Employee> employeeList;
    public Map<String, Teacher> teacherMap;
    private String deptName;

    public void deptInfo() {
        System.out.println("部门名称是:" + deptName);
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "employeeList=" + employeeList +
                ", teacherMap=" + teacherMap +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
