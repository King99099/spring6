package com.atguigu.spring.resources;

import org.springframework.core.io.UrlResource;

/**
 * ClassName:SpringResourceDemo
 * Package: com.atguigu.spring.resources
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/25 - 14:39
 * @Version: v1.0
 */
public class UrlResourceDemo {
    public static void loadAndReadUrlResource(String path){
        try {
            UrlResource urlResource = new UrlResource(path);
            System.out.println("urlResource.getURL() = " + urlResource.getURL());
            System.out.println("urlResource.getDescription() = " + urlResource.getDescription());
            System.out.println("urlResource.getFilename() = " + urlResource.getFilename());
            System.out.println("urlResource.getURI() = " + urlResource.getURI());
            System.out.println("urlResource.getInputStream() = " + urlResource.getInputStream().read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        //loadAndReadUrlResource("https://go.yimidida.com");
        loadAndReadUrlResource("file:NewFile.txt");
    }
}
