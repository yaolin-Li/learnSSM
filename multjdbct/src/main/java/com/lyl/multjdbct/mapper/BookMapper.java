package com.lyl.multjdbct.mapper;

import com.lyl.multjdbct.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookMapper {
    List<Book> getAllBooks();
}
