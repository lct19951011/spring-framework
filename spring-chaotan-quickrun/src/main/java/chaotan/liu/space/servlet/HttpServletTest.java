package chaotan.liu.space.servlet;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HttpServletTest extends HttpServlet {

	SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss.SSS");//设置日期格式,精确到毫秒

	public HttpServletTest(){
		System.out.println("构造方法被调用");
	}

	@Override
	public void init(ServletConfig config) throws ServletException{
		System.out.println("初始化方法：配置名称："+config.getServletName());
	}

	@Override
	public void destroy(){
		System.out.println("/n销毁了");
	}
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	System.out.println("doGet方法调用了");
        resp.getOutputStream().write("Hello Word".getBytes());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost方法调用了");
        doGet(req, resp);
    }

    @PostConstruct
   public void someMethod(){
    	//this.log("执行@PostConstruct修饰的someMethod()方法...");//注意：这样会出错
     System.out.println("时间："+df.format(new Date())+"执行@PostConstruct修饰的someMethod()方法...");
    }
    @PreDestroy
	 public void otherMethod(){
	    System.out.println("时间："+df.format(new Date())+"执行@PreDestroy修饰的otherMethod()方法...");
	  }
}