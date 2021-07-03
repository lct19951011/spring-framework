package org.springframework.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>启动</p>
 *
 * @author chaotan.liu
 * @version 1.0
 * @date 2020/7/23 19:57
 */

//@EnableAspectJAutoProxy
@ComponentScan("chaotan.liu.space.server")
public class QuickRun {
	public static void main(String[] args) {
		System.out.println("我终于还是进来了");
	}
}
