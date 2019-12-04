package com.lyl.learnehcache;

import com.lyl.learnehcache.Dao.BookDao;
import com.lyl.learnehcache.entity.Book;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
class LearnehcacheApplicationTests {
    @Autowired
    BookDao bookDao;

    @Test
    public void contextLoads() {
        bookDao.getBookById(1);
        bookDao.getBookById(1);
        bookDao.deleteBookById(1);
        Book b3 = bookDao.getBookById(1);
        System.out.println("b3:"+b3);
        Book b = new Book();
        b.setName("三国演义");
        b.setAuthor("罗贯中");
        b.setId(1);
        bookDao.updataBookById(b);
        Book b4 = bookDao.getBookById(1);
        System.out.println("b4:"+b4);
    }

}
