package com.yi.excel.controller;

import com.yi.excel.model.Book;
import io.github.biezhi.excel.plus.Writer;
import io.github.biezhi.excel.plus.exception.WriterException;
import io.github.biezhi.excel.plus.writer.ResponseWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 页面&下载
 *
 * @author YI
 * @date 2019-3-16 10:21:30
 */
@Controller
public class IndexController {

    /**
     * 主页
     * @return 主页面
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /**
     * 下载excel
     * @return excel下载
     */
    @RequestMapping("/download")
    public void download(HttpServletResponse servletResponse) throws WriterException {
        List<Book> books = new ArrayList<>();
        books.add(new Book("新名字的故事", "埃莱娜·费兰特", 59.0D, LocalDate.of(2017, 4, 1)));
        books.add(new Book("鱼王", "Царь-рыба", 78.0D, LocalDate.of(2017, 4, 1)));
        books.add(new Book("不可思议的朋友", "[日] 田岛征彦", 45.0D, LocalDate.of(2017, 7, 1)));
        books.add(new Book("杀死一只知更鸟", "[美] 哈珀·李", 48.0D, LocalDate.of(2017, 2, 1)));
        books.add(new Book("现代艺术150年", " [英] 威尔·贡培兹", 65.0D, LocalDate.of(2017, 3, 1)));

        Writer.create()
                .withRows(books)
                .headerTitle("书籍列表 V1")
                .to(ResponseWrapper.create(servletResponse ,"book.xlsx"));
    }
}
