package com.yq.sellPros;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;
import redis.clients.jedis.Jedis;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/loginServlet"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // 连接到Redis服务器
        Jedis jedis = new Jedis("localhost", 6379);

        // 检查用户名和密码是否匹配
        String storedPassword = jedis.get(username);

        if (storedPassword != null && storedPassword.equals(password)) {
            // 登录成功
            response.sendRedirect("study.html");
        } else {
            // 登录失败
            response.sendRedirect("login.html");
        }

        // 关闭Redis连接
        //jedis.close();
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ModelAndView handleNotFound() {
        // 在这里重定向到自定义错误页面
        return new ModelAndView("addshop.html");
    }
}

