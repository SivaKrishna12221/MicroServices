package com.nt.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
@Component
public class ZuulErrorFilter extends ZuulFilter{
     private Logger logger=LoggerFactory.getLogger(ZuulErrorFilter.class);
	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return FilterConstants.ERROR_TYPE;
	}@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		System.out.println("ZuulErrorFilter.run()");
		logger.info("Zull error filter");
		return null;
	}@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}
}
