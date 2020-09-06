package com.springcloud.study.web.filter;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.Base64Utils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 基础的认证请求头
 *
 * @author wangtongzhou
 * @since 2020-09-05 10:49
 */
public class BasicAuthecationFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authHeader = request.getHeader("Authorization");
        if (StringUtils.isNotBlank(authHeader)) {
            String token64 = StringUtils.substringAfter(authHeader, "Basic ");
            String token=new String(Base64Utils.decodeFromString(token64));
            String[] items=
                    StringUtils.splitByWholeSeparatorPreserveAllTokens(token,
                            ":");
            String userName=items[0];
            String passWord=items[1];

            request.setAttribute("user",userName);
        }
        filterChain.doFilter(request, response);
    }
}
