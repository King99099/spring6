package com.atguigu;

import com.atguigu.annotation.Bean;
import com.atguigu.beanfactory.AnnotionApplicationContext;
import com.atguigu.beanfactory.ApplicationContext;
import com.atguigu.service.UserService;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:test
 * Package: com.atguigu
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/22 - 14:47
 * @Version: v1.0
 */
public class test {
    private static String rootPath;
    private Map<Class, Object> beanFactory = new HashMap<>();

    @Test
    public void test1(){
        try {
            ApplicationContext context = new AnnotionApplicationContext("com.atguigu");
            UserService bean = (UserService) context.getBean(UserService.class);
            bean.add();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void test() throws IOException {
        String basePackage = "com.atguigu";
        String packageDirName = basePackage.replaceAll("\\.", "\\\\");
        Enumeration<URL> dirs = Thread.currentThread().getContextClassLoader().getResources(packageDirName);
        while (dirs.hasMoreElements()) {
            URL url = dirs.nextElement();
                    System.out.println("url = " + url);
                    System.out.println("url.getFile = " + url.getFile());
                    //url = file:/D:/mvn-workspace/spring6/guigu-spring/target/classes/com%5catguigu
            String filePath = URLDecoder.decode(url.getFile(), "utf-8");
                    System.out.println("filePath = " + filePath);
            rootPath = filePath.substring(0, filePath.length() - packageDirName.length());
                    System.out.println("rootPath = " + rootPath);
/*
            File file = new File(filePath);
                    System.out.println("file.isDirectory() = " + file.isDirectory());
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                System.out.println("files = " + files[i]);
            }*/
            loadBean(new File(filePath));
        }
    }

    @Test
    private void loadBean(File fileParent) {
        if (fileParent.isDirectory()) {
            File[] childrenFiles = fileParent.listFiles();
            if (childrenFiles == null || childrenFiles.length == 0) {
                return;
            }
            for (File child : childrenFiles) {
                System.out.println("child = " + child);
                System.out.println("child.getAbsolutePath = " + child.getAbsolutePath());
                if (child.isDirectory()) {
                    //如果是个文件夹就继续调用该方法,使用了递归
                    loadBean(child);
                } else {
                    //通过文件路径转变成全类名,第一步把绝对路径部分去掉
                    String pathWithClass = child.getAbsolutePath().substring(rootPath.length() - 1);
                    System.out.println("pathWithClass = " + pathWithClass);
                    //选中class文件
                    if (pathWithClass.contains(".class")) {
                        //    com.xinzhi.dao.UserDao
                        //去掉.class后缀，并且把 \ 替换成 .
                        String fullName = pathWithClass.replaceAll("\\\\", ".").replace(".class", "");
                        try {
                            Class<?> aClass = Class.forName(fullName);
                            //把非接口的类实例化放在map中
                            if (!aClass.isInterface()) {
                                Bean annotation = aClass.getAnnotation(Bean.class);
                                if (annotation != null) {
                                    Object instance = aClass.newInstance();
                                    //判断一下有没有接口
                                    if (aClass.getInterfaces().length > 0) {
                                        //如果有接口把接口的class当成key，实例对象当成value
                                        System.out.println("正在加载【" + aClass.getInterfaces()[0] + "】,实例对象是：" + instance.getClass().getName());
                                        beanFactory.put(aClass.getInterfaces()[0], instance);
                                    } else {
                                        //如果有接口把自己的class当成key，实例对象当成value
                                        System.out.println("正在加载【" + aClass.getName() + "】,实例对象是：" + instance.getClass().getName());
                                        beanFactory.put(aClass, instance);
                                    }
                                }
                            }
                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
