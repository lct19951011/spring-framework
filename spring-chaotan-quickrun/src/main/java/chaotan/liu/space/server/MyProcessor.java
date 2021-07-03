package chaotan.liu.space.server;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * <p>后置处理期-----于扫描后执行---在默认的BeanFactoryPostProcessor实现类执行完后执行</p>
 *
 * @author chaotan.liu
 * @version 1.0
 * @date 2020/7/25 12:16
 */

@Component
public class MyProcessor  implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("执行 - BeanFactoryPostProcessor 的postProcessBeanFactory");
	}
}
