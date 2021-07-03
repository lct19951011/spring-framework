package org.springframework.test;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.server.UserServer;

/**
 * <p></p>
 *
 * @author chaotan.liu
 * @version 1.0
 * @date 2020/7/24 8:51
 */

public class Api {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  a = new AnnotationConfigApplicationContext(QuickRun.class);

//		Object api = a.getBean("QuickRun");
//		System.out.println(api.toString());
		UserServer userServer = a.getBean(UserServer.class);

		System.out.println(userServer.toString());

		//扫描包
		a.scan("chaotan.liu.space.server");
		QuickRun.main(new String[]{});
	}
}
