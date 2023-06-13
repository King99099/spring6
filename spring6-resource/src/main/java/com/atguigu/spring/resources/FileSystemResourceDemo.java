package com.atguigu.spring.resources;

import org.springframework.core.io.FileSystemResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:FileSystemResourceDemo
 * Package: com.atguigu.spring.resources
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/25 - 16:53
 * @Version: v1.0
 */
public class FileSystemResourceDemo {
    public static void loadAndReadUrlResource() throws IOException {
        //相对路径
        FileSystemResource resource = new FileSystemResource("D:\\DataPro\\aa.txt");
        //绝对路径
        //FileSystemResource resource = new FileSystemResource("C:\\atguigu.txt");
        // 获取文件名
        System.out.println("resource.getFileName = " + resource.getFilename());
        // 获取文件描述
        System.out.println("resource.getDescription = " + resource.getDescription());
        //获取文件内容
        InputStream in = resource.getInputStream();
        byte[] b = new byte[1024];
        while (in.read(b) != -1) {
            System.out.println(new String(b));
        }
    }

    public static void main(String[] args) {
        try {
            loadAndReadUrlResource();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
