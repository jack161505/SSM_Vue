package com.jack.dao.mapper;

import com.jack.model.beans.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: 李善玺
 * @Date: 2020/4/26 9:23
 * @Version 1.0
 */
@Repository
public interface BookMapper {

    public List<Book> selectAll();
}
