package module03JavaWeb.day01.annotation.demo;

import module03JavaWeb.day01.junit.Calculator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 *
 * 当主方法执行后，会自动执行被检测的所有方法
 */
public class TestCheck {

    public static void main(String[] args) throws IOException {
        Calculator c = new Calculator();
        Class cls = c.getClass();
        Method[] methods = cls.getMethods();

        int num = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
//            if (method.isAnnotationPresent(Check.class)){
//                try {
//                    method.invoke(c);
//                }catch (Exception e){
//                    num++;
//                    bw.write(method.getName());
//                    bw.newLine();
//                    bw.write(e.getCause().getClass().getSimpleName());
//                    bw.newLine();
//                    bw.write(e.getCause().getMessage());
//                    bw.newLine();
//
//                }
//            }
        }
        bw.write("本次测试一共出现"+num+"次异常");
        bw.flush();
        bw.close();
    }
}
