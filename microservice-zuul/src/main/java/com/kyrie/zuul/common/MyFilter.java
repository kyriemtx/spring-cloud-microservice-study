package com.kyrie.zuul.common;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName MyFilter
 * @Description
 * @Author Kyrie
 * @Date 2019/8/13 9:52
 * @Version 1.0
 **/
@Component
public class MyFilter  extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public String filterType(){
        return "pre";

    }
    @Override
    public int filterOrder(){
        return  0;

    }
    @Override
    public boolean shouldFilter(){
        return true;
    }
    @Override
    public Object run(){
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            logger.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }
        logger.info("ok");
        return null;

    }

}
