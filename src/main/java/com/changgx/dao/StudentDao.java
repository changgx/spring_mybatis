package com.changgx.dao;

import com.changgx.annotation.MyBatisDao;
import com.changgx.bean.Student;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/7/22.
 */
@MyBatisDao
public interface StudentDao {
    void buyBook(HashMap params);
    Student select(String name);
}
