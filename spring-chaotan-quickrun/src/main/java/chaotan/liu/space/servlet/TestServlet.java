package chaotan.liu.space.servlet;

import javax.servlet.*;
import java.io.IOException;

public class TestServlet implements Servlet {
    /*
        当servlet被创建时调用。做初始化工作
        仅第一次被访问时调用（可以改的）
     */
    public void init(ServletConfig config) throws ServletException {

        System.out.println("servlet组件初始化。。。");
    }

    /*
        servlet的配置对象，初始化的时候可以进行配置
     */
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig方法调用。。。");
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service处理请求。。。");
        res.getOutputStream().write("<font color='red'>HelloServlet</font>".getBytes());
    }

    /*
        获取当前servlet一些属性信息
     */
    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo方法调用。。。");
        return null;
    }

    /*
        销毁时被调用
     */
	@Override
    public void destroy() {
        System.out.println("destroy销毁实例。。。");
    }
}