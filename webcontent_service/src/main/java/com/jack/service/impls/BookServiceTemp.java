package com.jack.service.impls;

import com.jack.dao.mapper.BookMapper;
import com.jack.model.beans.Book;
import com.jack.service.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: 李善玺
 * @Date: 2020/4/23 17:10
 * @Version 1.0
 */
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
@Service("bookService")
public class BookServiceTemp implements BookService{

    //使用dao层接口
    @Autowired
    private BookMapper bookMapper;


    public List<Book> selectAll() {
        List<Book> lists=bookMapper.selectAll();
        return lists;
    }
}
