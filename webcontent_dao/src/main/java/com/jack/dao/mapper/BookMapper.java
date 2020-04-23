package com.jack.dao.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.jack.model.beans.Book;

import java.util.List;

/**
 * @Author: 李善玺
 * @Date: 2020/4/23 16:45
 * @Version 1.0
 */
@Repository
public interface BookMapper {
    int countByExample(Book book);
    int deleteByExample(Book book);
    int insert(Book record);
    int insertSelective(Book record);

    List<Book> selectByExample(Book book);
    List<Book> selectAll();
    int updateByExampleSelective(@Param("record") Book record);
    int updateByExample(@Param("record") Book record);
}
