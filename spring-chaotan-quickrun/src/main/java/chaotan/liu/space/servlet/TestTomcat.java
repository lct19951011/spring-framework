package chaotan.liu.space.servlet;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

public class TestTomcat {//Test.class
    //通过如下方法启动tomcat

    public static  void  main(String[] args)throws Exception {
        //1.构建tomcat对象(遵循JAVAEE规范)
        Tomcat t=new Tomcat();
        //2.构建Connector对象(连接器),负责协议配置,端口配置等
        Connector conn=new Connector("HTTP/1.1");
        conn.setPort(8080);
        t.getService().addConnector(conn);
        //3.启动tomcat
        t.start();
        //4.阻塞当前线程
        t.getServer().await();


        
    }
}