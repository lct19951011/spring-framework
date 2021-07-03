package org.springframework.test.server;

import org.springframework.stereotype.Service;

/**
 * <p>用户服务</p>
 *
 * @author chaotan.liu
 * @version 1.0
 * @date 2020/7/23 19:59
 */

@Service
public class UserServerImpl implements UserServer {
	private String name;


	private String age;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
