package com.book.controller;

import com.book.model.Book;
import com.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/book")
public class BookController extends HandlerInterceptorAdapter {

    //preHandle在业务处理器处理请求之前被调用。
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        return super.preHandle(request, response, handler);
    }
    //postHandle在业务处理器处理请求执行完成后,生成视图之前执行。
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
        super.postHandle(request, response, handler, modelAndView);
    }
    //afterCompletion在DispatcherServlet完全处理完请求后被调用,可用于清理资源等 。
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterHandle");
        super.afterCompletion(request, response, handler, ex);
    }

    @Autowired
    private BookService bookService;

    @RequestMapping("/index")
    public String BookController(){
        return "book/index";
    }

    @RequestMapping(params = "method=Add")
    public String add(Book book){
        System.out.println("bookname:"+book.getName());
        System.out.println("author:"+book.getAuthor());
        bookService.add(book);
        return "book/success";
    }

    @RequestMapping(params = "method=Update")
    public String update(Book book) {
        bookService.update(book);
        return "book/success";
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String add111(Book book){
        System.out.println("id:"+book.getId());
        System.out.println("bookname:"+book.getName());
        System.out.println("author:"+book.getAuthor());
        bookService.add(book);
        return "book/success";
    }

    @RequestMapping(value = "/testAll")
    @ResponseBody
    public String testAll(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        System.out.println("sdfsdfsdfsd");
        return "test";
    }

}