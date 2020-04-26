import com.jack.model.beans.Book;
import com.jack.service.services.impls.BookServiceTemp;
import com.jack.service.services.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: 李善玺
 * @Date: 2020/4/23 18:07
 * @Version 1.0
 */

public class Test01 {

    @Autowired
    private BookService bookService;

    public void Test02(){
        //给ajax返回json格式的字符串
        List<Book> books=bookService.selectAll();

    }



    //给ajax返回json格式的字符串
    @Test
    @RequestMapping(value = "/selectAll")
    @ResponseBody
    public void selectAll() throws Exception
    {
        bookService=new BookServiceTemp();
        List<Book> books=bookService.selectAll();
    }
}
