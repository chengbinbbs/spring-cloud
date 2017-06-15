package com.chengbinbbs.filter;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
/**
 * @author zhangcb
 * @created 2017-06-15 9:32.
 */
public class AfterCsrfFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("This is a filter after CsrfFilter.");
        // 继续调用 Filter 链
        filterChain.doFilter(servletRequest, servletResponse);
    }

}
