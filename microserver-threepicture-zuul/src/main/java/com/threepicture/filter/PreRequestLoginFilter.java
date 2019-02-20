package com.threepicture.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * 过滤器类型：
 * pre 这种过滤器在请求被路由之前调用，用作身份验证 在集群中选择请求的微服务/记录调试信息等
 * routing 将请求路由到微服务 用于将构建发送给微服务
 * post 路由到微服务之后执行 用作为响应添加标准的http header 收集统计信息和指标，将响应从微服务发送到客户端你
 * error 其他阶段发生错误时执行该过滤器
 * @author 杏仁拌饭
 *
 */
public class PreRequestLoginFilter extends ZuulFilter {

	@Override
	public Object run() {
		// 过滤器的具体逻辑。需要注意，这里我们通过ctx.setSendZuulResponse(false)令zuul过滤该请求，不对其进行路由，然后通过ctx.setResponseStatusCode(401)设置了其返回的错误码过滤器间的协调
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// 判断是否需要执行该过滤器
		return false;
	}

	@Override
	public int filterOrder() {
		// 返回过滤器执行顺序 数字越大优先级越低
		return 0;
	}

	@Override
	public String filterType() {
		// 返回过滤器类型
		return "pre";
	}

}
