package com.changgx.service;

import com.changgx.bean.Book;
import com.changgx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/7/22.
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;
    public int selectBookSum(){
        return bookDao.selectBookSum();
    }
    public List select(){
        return bookDao.select();
    }

    public Book selectBookByBookName(String bookName){
        return bookDao.selectBookByBookName(bookName);
    }
    public void buyBook(String bookName){
        bookDao.buyBook(bookName);
    }
}
