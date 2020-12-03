package module03JavaWeb.day01.reflect;

import com.sun.source.tree.MethodInvocationTree;
import module03JavaWeb.day01.domain.Person;
import module03JavaWeb.day01.domain.Student;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;


/**
 * 框架类
 */
public class ReflecTest {

    public static void main(String[] args) throws Exception {
        //可以创建任意类的对象，可以执行任意方法
        /**
         * 不能改变该类的任何代码，可以创建任意类的对象，可以执行任意方法
         */
//        Person p = new Person();
//        p.eat();
//        Student s = new Student();
//        s.sleep();

        Properties pro = new Properties();
        ClassLoader classLoader = ReflecTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        Class<?> cls = Class.forName(className);

        Object o = cls.getDeclaredConstructor().newInstance();

        Method method = cls.getMethod(methodName);

        method.invoke(o);


    }
}
