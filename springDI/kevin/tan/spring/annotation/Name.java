package kevin.tan.spring.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * 作用范围，在哪些地方保留：
 *   java             RetentionPolicy.SOURCE
 *   java+class       RetentionPolicy.CLASS
 *   java+class+jvm   RetentionPolicy.RUNTIME
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
public @interface Name {
	String value() default "";
}
