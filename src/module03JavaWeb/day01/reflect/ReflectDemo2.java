package module03JavaWeb.day01.reflect;

import module03JavaWeb.day01.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    /**
     * * Class对象功能：
     * 	* 获取功能：
     * 		1. 获取成员变量们
     * 			* Field[] getFields() ：获取所有public修饰的成员变量
     * 			* Field getField(String name)   获取指定名称的 public修饰的成员变量
     *
     * 			* Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
     * 			* Field getDeclaredField(String name)
     * 		2. 获取构造方法们
     * 			* Constructor<?>[] getConstructors()
     * 			* Constructor<T> getConstructor(类<?>... parameterTypes)
     *
     * 			* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
     * 			* Constructor<?>[] getDeclaredConstructors()
     * 		3. 获取成员方法们：
     * 			* Method[] getMethods()
     * 			* Method getMethod(String name, 类<?>... parameterTypes)
     *
     * 			* Method[] getDeclaredMethods()
     * 			* Method getDeclaredMethod(String name, 类<?>... parameterTypes)
     */
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        //1.获取成员变量们
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Field field = personClass.getField("a");
        Person p  = new Person();
        Object value = field.get(p);
        System.out.println(value);
        field.set(p,"张三");
        System.out.println(p);

        System.out.println("--------------");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);//暴力反射
        Object o = name.get(p);
        System.out.println(o);


    }
}
