package chaotan.liu.space.servlet;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

public class ServletTests {
    //嵌入式tomcat测试

    public static void main(String[] args)throws Exception {
      //构建tomcat对象,此对象为启动tomcat服务的入口对象
      Tomcat t=new Tomcat();
      //构建Connector对象,此对象负责与客户端的连接.
      Connector con=new Connector("HTTP/1.1");
      //设置服务端的监听端口
      con.setPort(8080);
      //将Connector注册到service中
      t.getService().addConnector(con);
      //注册servlet
      Context ctx=t.addContext("/",null);
      Tomcat.addServlet(
              ctx,
              "helloServlet",
              "chaotan.liu.space.servlet.HttpServletTest");
      //映射servlet
      ctx.addServletMappingDecoded("/hello", "helloServlet");
      //启动tomcat
      t.start();
      //阻塞当前线程
      System.out.println(Thread.currentThread().getName()+"--------------");
      t.getServer().await();
      //while(true) {}
    }
}