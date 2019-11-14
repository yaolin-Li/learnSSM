package com.lyl.multjdbct.mapper2;

import com.lyl.multjdbct.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookMapper2 {
    List<Book> getAllBooks();
}
