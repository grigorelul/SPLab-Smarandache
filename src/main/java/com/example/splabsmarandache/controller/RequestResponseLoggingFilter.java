package com.example.splabsmarandache.controller;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(2)
public class RequestResponseLoggingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
//        LOG.info(
//                "Logging Request  {} : {}", req.getMethod(),
//                req.getRequestURI());
        chain.doFilter(request, response);
//        LOG.info(
//                "Logging Response :{}",
//                res.getContentType());
    }

    @Override
    public void destroy() {

    }


    // other methods
}
