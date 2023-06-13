package com.atguigu.spring.bean;

/**
 * ClassName:Book
 * Package: com.atguigu.spring.bean
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/16 - 11:06
 * @Version: v1.0
 */
public class Book {
    public String name;
    public String author;

    public String others;

    public Book() {
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }
}
