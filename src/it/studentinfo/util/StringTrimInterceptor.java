package it.studentinfo.util;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class StringTrimInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 3128906880687405724L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext context = invocation.getInvocationContext();
		// 从ActionContext中获取客户端�?有的参数名称,和�??
		Map<String, Object> params = context.getParameters();
		for (String key : params.keySet()) {
			Object o = params.get(key);
			if (o instanceof String[]) {
				String[] values = (String[]) o;
				for (int i = 0; i < values.length; i++) {
					values[i] = values[i].trim();
				}
				params.put(key, values);
			}
		}
		// 跳转到下�?个拦截器
		return invocation.invoke();
	}

}
