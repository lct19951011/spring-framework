package org.springframework.test.server;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * <p>在扫描包之前执行</p>
 *
 * @author chaotan.liu
 * @version 1.0
 * @date 2020/7/27 11:29
 */

@Component
public class RegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("执行-BeanDefinitionRegistryPostProcessor：postProcessBeanDefinitionRegistry");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("执行-BeanDefinitionRegistryPostProcessor：postProcessBeanFactory");
	}
}
