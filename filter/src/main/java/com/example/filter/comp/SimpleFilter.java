package com.example.filter.comp;


import java.io.IOException;

import jakarta.servlet.Filter; 
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException; 
import jakarta.servlet.ServletRequest; 
import jakarta.servlet.ServletResponse; 

import org.springframework.stereotype.Component;

// Cite: https://www.geeksforgeeks.org/spring-boot-servlet-filter/

@Component
public class SimpleFilter implements Filter {
   @Override
   public void destroy() {}

   @Override
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain) 
      throws IOException, ServletException {
      
      System.out.println("Remote Host:"+request.getRemoteHost());
      System.out.println("Remote Address:"+request.getRemoteAddr());
      filterchain.doFilter(request, response);
   }

   @Override
   public void init(FilterConfig filterconfig) throws ServletException {}
}