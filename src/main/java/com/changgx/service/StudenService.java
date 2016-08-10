package com.changgx.service;

import com.changgx.bean.Book;
import com.changgx.bean.Student;
import com.changgx.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/7/22.
 */
@Service
public class StudenService {
    @Autowired
    private BookService bookService;
    @Autowired
    private StudentDao studentDao;
    public void buyBook(String studentName,String bookName) throws Exception {
        Book book=bookService.selectBookByBookName(bookName);
        HashMap params=new HashMap();
        params.put("price",book.getPrice());
        params.put("studentName",studentName);
        studentDao.buyBook(params);
        bookService.buyBook(bookName);

        book=bookService.selectBookByBookName(bookName);
        Student student=studentDao.select(studentName);
        if(book.getNum()<0||student.getMoney()<0){
            throw new RuntimeException();
        }
    }
}
