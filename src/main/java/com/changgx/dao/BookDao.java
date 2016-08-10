package com.changgx.dao;

import com.changgx.annotation.MyBatisDao;
import com.changgx.bean.Book;

import java.util.List;

/**
 * Created by Administrator on 2016/7/22.
 */
@MyBatisDao
public interface BookDao {
    int selectBookSum();
    List select();
    Book selectBookByBookName(String bookName);
    void buyBook(String bookName);
}
