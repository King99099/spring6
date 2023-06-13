package com.atguigu.beanfactory;

import com.atguigu.annotation.Bean;
import com.atguigu.annotation.Di;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:AnnotionApplicationContext
 * Package: com.atguigu.beanfactory
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/22 - 11:01
 * @Version: v1.0
 */
public class AnnotionApplicationContext implements ApplicationContext {

    private Map<Class, Object> beanFactory = new HashMap<>();
    private static String rootPath;

    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }

    //D:\mvn-workspace\spring6\guigu-spring\src\main\java\com\atguigu
    public AnnotionApplicationContext(String basePackage) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String packageDriName = basePackage.replaceAll("\\.", "\\\\");
        Enumeration<URL> dirs = Thread.currentThread().getContextClassLoader().getResources(packageDriName);
        while (dirs.hasMoreElements()) {
            URL url = dirs.nextElement();
            String filePath = URLDecoder.decode(url.getFile(), "utf-8");
            rootPath = filePath.substring(0, filePath.length() - basePackage.length());
            loadBean(new File(filePath));
        }
        loadDi();
    }

    private void loadBean(File fileParent) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        if (fileParent.isDirectory()) {
            File[] childrenFiles = fileParent.listFiles();
            if (childrenFiles == null && childrenFiles.length == 0) {
                return;
            }
            for (File childrenFile : childrenFiles) {
                if (childrenFile.isDirectory()){
                    loadBean(childrenFile);
                }else {
                    String pathWithClass = childrenFile.getAbsolutePath().substring(rootPath.length() - 1);
                    //pathWithClass = com\atguigu\service\impl\UserServiceImpl.class
                    if (pathWithClass.contains(".class")){
                        String fullName = pathWithClass.replaceAll("\\\\", ".").replace(".class", "");
                        //fullName = com.atguigu.service.impl.UserServiceImpl
                        Class<?> aClass = Class.forName(fullName);
                        if (!aClass.isInterface()){
                            Bean annotation = aClass.getDeclaredAnnotation(Bean.class);
                            if (annotation != null){
                                Object instance = aClass.newInstance();
                                if (aClass.getInterfaces().length >0){
                                    //如果有接口把接口的class当成key，实例对象当成value
                                    System.out.println("正在加载【"+ aClass.getInterfaces()[0] +"】,实例对象是：" + instance.getClass().getName());
                                    beanFactory.put(aClass.getInterfaces()[0],instance);
                                }else {
                                    //如果有接口把自己的class当成key，实例对象当成value
                                    System.out.println("正在加载【"+ aClass.getName() +"】,实例对象是：" + instance.getClass().getName());
                                    beanFactory.put(aClass,instance);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    private void loadDi(){
        for(Map.Entry<Class,Object> entry : beanFactory.entrySet()){
            //就是咱们放在容器的对象
            Object obj = entry.getValue();
            Class<?> aClass = obj.getClass();
            Field[] declaredFields = aClass.getDeclaredFields();
            for (Field field : declaredFields){
                Di annotation = field.getAnnotation(Di.class);
                if( annotation != null ){
                    field.setAccessible(true);
                    try {
                        System.out.println("正在给【"+obj.getClass().getName()+"】属性【" + field.getName() + "】注入值【"+ beanFactory.get(field.getType()).getClass().getName() +"】");
                        field.set(obj,beanFactory.get(field.getType()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
