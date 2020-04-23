package com.jack.service.services;

import com.jack.model.beans.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 李善玺
 * @Date: 2020/4/23 17:14
 * @Version 1.0
 */
@Service
public interface BookService {
    List<Book> selectAll();
}
