package com.huihui.spring;

/**
 * @author zhazhahui
 * @create 2021-07-22 16:46
 */

/**
 * 使用set方法注入属性
 */

public class Book {
    private String bname;
    private String author;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }
    //public Book(String bname, String author) {
    //    this.bname = bname;
    //    this.author = author;
    //}

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void test() {
        System.out.println(bname + " ---" + author + "-" + address);
    }
}
