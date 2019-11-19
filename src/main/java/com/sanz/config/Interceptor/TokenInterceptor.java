package com.sanz.config.Interceptor;

/**
 * @author: key
 * @DATE: 2019/11/19 14 : 38
 * @CLASSNAME TokenInterceptor
 */

import com.sanz.config.handle.BusinessException;
import com.sanz.config.handle.ResultStatus;
import com.sanz.config.jwt.JwtConfig;
import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Token 拦截器
 */
@Component
public class TokenInterceptor extends HandlerInterceptorAdapter {
    @Resource
    private JwtConfig jwtConfig;
    //添加
    static List<String> list = new ArrayList<>();

    static {
        list.add("/login");
    }

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        // 地址过滤
        String uri = request.getRequestURI();
        if (list.contains(uri)) {
            return true;
        }
        // Token 验证
        String token = request.getHeader(jwtConfig.getHeader());
        if (StringUtils.isEmpty(token)) {
            token = request.getParameter(jwtConfig.getHeader());
        }
        if (StringUtils.isEmpty(token)) {
            throw new BusinessException(ResultStatus.getInstanceByName("token不能为空"));
        }
        Claims claims = jwtConfig.getTokenClaim(token);
        if (claims == null || jwtConfig.isTokenExpired(claims.getExpiration())) {
            throw new BusinessException(ResultStatus.getInstanceByName("token失效,请重新登录"));
        }
        //设置 identityId 用户身份ID
        request.setAttribute("identityId", claims.getSubject());
        return true;
    }
}
