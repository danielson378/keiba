package com.beautyred.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class PowerInterceptor implements Interceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext context = invocation.getInvocationContext();

		//通过ActionContext来获取httpRequest

		HttpServletRequest request = (HttpServletRequest) context.get(StrutsStatics.HTTP_REQUEST);

		//也可以通过ServletActionContext来获取httpRequest
		//HttpServletRequest request = ServletActionContext.getRequest();
		//取得根目录的绝对路径

		String currentURL = request.getRequestURI();

		//截取到访问的相对路径，可以通过这个来进行相应的权限控制
		//System.out.println("当前请求的路径: " + currentURL); // 如：  /ElectiveSystem/admin/admin_login.action

		String targetURL = currentURL.substring(currentURL.indexOf("/", 1), currentURL.length());
		//System.out.println("当前请求的路径: " + currentURL); //如：  /admin/admin_login.action

		if ("/admin/admin_login.action".equals(targetURL) || "/stu/stu_login.action".equals(targetURL)
				|| "/th/th_login.action".equals(targetURL)) {

			//执行方法，获取返回值

			String result = invocation.invoke();

			//System.out.println(result);

			return result;
		} else {

			//通过ActionContext获取session的信息。

			Object obj = context.getSession().get("user");

			//获取容器里面的user值，如果存在说明该用户已经登录，让他执行操作，如果未登录让他进行登录

			if (obj != null) {

				return invocation.invoke();
			}
		}

		return "login";

	}

	@Override
	public void destroy() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void init() {
		// TODO 自動生成されたメソッド・スタブ

	}
}
