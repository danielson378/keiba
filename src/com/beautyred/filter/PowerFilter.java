package com.beautyred.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PowerFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;

		//取得根目录的绝对路径
		String currentURL = request.getRequestURI();
		//System.out.println("当前请求的路径: " + currentURL);
		//截取到访问的相对路径，可以通过这个来进行相应的权限控制

		currentURL = currentURL.substring(currentURL.indexOf("/", 1), currentURL.length());

		// 如果请求路径包含jsp，就判断是不是login.jsp
		if (currentURL.contains("jsp")) {
			if ("/login.jsp".equals(currentURL) || "/login.jsp" == currentURL) {

				//所有人都能请求到的URI，放行
				chain.doFilter(request, response);
			} else { //下面是判断是否有session，也就是用户是否已登录状态；

				HttpSession session = request.getSession();

				Object obj = session.getAttribute("username");

				if (obj == null) {

					//System.out.println("URI:" + currentURL + ">>>>访问被拒绝！");

					response.sendRedirect("login.jsp");
				} else {
					chain.doFilter(request, response);
				}
			}
		} else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO 自動生成されたメソッド・スタブ

	}
}
