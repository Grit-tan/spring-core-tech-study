package kevin.tan.spring.di.scanAndAnnotation;

import java.util.List;

import org.junit.Test;

import kevin.tan.spring.util.SpringHelper;
/**
 * 原理：
 * 	1.启动spring容器，并加载spring配置文件
 * 	spring 容器解析	<context:component-scan base-package="kevin.tan.spring.di.scanAndAnnotation"></context:component-scan>
       spring容器会在指定的包以及其子包中查找所有类中是否含有@Component
       如果@Component没有属性---默认属性值为类名第一个首字母小写
        @Component
 *        public class Person{
 *        
 *        }
 *        ==
 *        <bean id="person" class="..Person">
 *      如果@Component("aa")
 *        @Component("aa")
 *        public class Person{
 *        
 *        }
 *        ==
 *        <bean id="aa" class="..Person">
 *    *  在纳入spring管理的bean的范围内查找@Resource注解
 *    *  执行@Resource注解的过程
 *  说明：
 *     xml效率比较高，但是书写比较麻烦
 *     注解效率比较低，书写比较简单
 * @author Administrator
 *
 */

public class PersonTest extends SpringHelper {
	static{
		path="kevin/tan/spring/di/scanAndannotation/applicationContext.xml";
	}
	@Test
	public void test(){
		Person person = (Person) context.getBean("person");
		List list = person.getList();
		list.add("aaa");
		System.out.println(person);
		Person person2 = (Person) context.getBean("person");
		List list2 = person2.getList();
		list2.add("bbb");
		System.out.println(person2);
		System.out.println(list.size());
		System.out.println(list2.size());
	}
}
