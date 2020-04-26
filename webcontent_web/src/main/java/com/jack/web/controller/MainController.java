package com.jack.web.controller;

import com.jack.model.beans.Bfcount;
import com.jack.model.beans.Book;
import com.jack.service.services.BfcountService;
import com.jack.service.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.log4j.Logger;

import com.jack.commom.utils.Result;

import java.util.List;
/**
 * @Author: 李善玺
 * @Date: 2020/4/23 13:08
 * @Version 1.0
 */


@Controller
@RequestMapping("/book")
public class MainController {

    @Autowired
    private BookService bookService;
    @Autowired
    private BfcountService bfcountService;

    private Logger logger= Logger.getLogger(MainController.class);

    //给ajax返回json格式的字符串
    @RequestMapping(value = "/selectAll")
    @ResponseBody
    public List<Book> selectAll() throws Exception
    {
        List<Book> books=bookService.selectAll();
        return books;
    }

    @ResponseBody
    @CrossOrigin
    public Result check(){
        logger.info("MainController run");
        Result result=new Result();
        result.setMessage("SSM vue前后端框架搭建成功！");
        return result;
    }

    @RequestMapping(value = "/selectAllBfcount")
    @ResponseBody
    public List<Bfcount> selectAllBfcount() throws Exception{
        List<Bfcount> lists=bfcountService.selectAll();
        return lists;
    }
}
