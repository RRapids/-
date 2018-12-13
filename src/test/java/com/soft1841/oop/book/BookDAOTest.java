package com.soft1841.oop.book;

import cn.hutool.db.Entity;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class BookDAOTest {
//通过接口回调，
    private BookDAO bookDAO = new BookDAOImpl();
    @Test
    public void getAllBooks() throws SQLException {
        //通过bookDAO接口调用查询所用图书的方法，得到一个集合
        List<Entity> bookList = bookDAO.getAllBooks();
        //通过Lambda遍历集合，输出结果
        bookList.forEach(entity -> System.out.println(entity.get("name")+";"+entity.get("price")));

    }

    @Test
    public void insert() throws SQLException {
        //创建一个Book对象,用来插入
        Book book = new Book("测试","张三",22.3,"https://img3.doubanio.com/view/subject/m/public/s2738366.jpg");
        //受影响的记录行数n
        int n;
        n = bookDAO.insert(book);
        //用断言判定
        assertEquals(1,n);
    }

    @Test
    public void delete() throws SQLException{
        int n = bookDAO.delete(11);
        assertEquals(1,n);

    }
    @Test
    public void get() throws SQLException{
        //获取id为1的实体信息
        Entity entity = bookDAO.get(1);
        System.out.println(entity.get("name") + "," + entity.get("price"));
    }


    @Test
    public void update() throws SQLException {
        Book book = new Book();
        book.setPrice(128.8);
        book.setId(1);
        int n = bookDAO.update(book);
        assertEquals(1,n);
    }
}