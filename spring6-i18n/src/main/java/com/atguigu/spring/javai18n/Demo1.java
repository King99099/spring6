package com.atguigu.spring.javai18n;

import javax.print.DocFlavor;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * ClassName:JavaI18n
 * Package: com.atguigu.spring
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/26 - 10:58
 * @Version: v1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        getI18n("GB");
    }

    public static void getI18n(String country) {
        if ("CN".contains(country)) {
            ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("zh", "CN"));
            String username = bundle.getString("username");
            String password = bundle.getString("password");
            System.out.println("username = " + username);
            System.out.println("password = " + password);
        } else {
            ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "GB"));
            String username = bundle.getString("username");
            String password = bundle.getString("password");
            System.out.println("username = " + username);
            System.out.println("password = " + password);
        }
    }
}
