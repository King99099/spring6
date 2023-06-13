package com.atguigu.spring.resources;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:SpringResourceDemo
 * Package: com.atguigu.spring.resources
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/25 - 14:39
 * @Version: v1.0
 */
public class ClassPathResourceDemo {
    public static void loadAndReadUrlResource(String path){
        ClassPathResource resource = new ClassPathResource(path);
        try {
            System.out.println("resource.getFilename() = " + resource.getFilename());
            System.out.println("resource.getURL() = " + resource.getURL());
            System.out.println("resource.getDescription() = " + resource.getDescription());
            InputStream inputStream = resource.getInputStream();
            byte[] b = new byte[1024];
            while (inputStream.read(b) != -1){
                System.out.println(new String(b));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        //loadAndReadUrlResource("https://go.yimidida.com");
        loadAndReadUrlResource("atguigu.txt");
    }
}
