package it.studentinfo.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodeFilter implements Filter {
	
	String encode="GBK";

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filter) throws IOException, ServletException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding(encode);
	
		filter.doFilter(request, response);
		response.setCharacterEncoding(encode);
	}

	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("endcode filter start");
		encode=config.getInitParameter("encode");
	}

}
