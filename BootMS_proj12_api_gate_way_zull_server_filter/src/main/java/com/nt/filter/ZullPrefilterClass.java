package com.nt.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZullPrefilterClass extends ZuulFilter {
	
	private Logger logger=LoggerFactory.getLogger(ZullPrefilterClass.class);
	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return FilterConstants.PRE_TYPE;
	}

	@Override
	public Object run() throws ZuulException {
		
		//get context object it contains mulitple objecst
	  // RequestContext ctx=RequestContext.getCurrentContext();
	   //get httprequet
		/*
		 * HttpServletRequest request =
		 * System.out.println("ZullPrefilterClass.run()==>prefilter ");
		 * logger.info(request.getContentType()+"content type");
		 * logger.info(request.getMethod()+" method name");
		 * loggers.info(request.getPathInfo()+" path info");
		 * 
		 */
		System.out.println("ZullPrefilterClass.run()");
		logger.info("Zull pre filter is executing");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}
}
