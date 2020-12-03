package module03JavaWeb.day01.reflect;

import module03JavaWeb.day01.domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception{
        Class<Person> personClass = Person.class;

        Method eat = personClass.getMethod("eat");
        System.out.println(eat);

        Person p = new Person();
        eat.invoke(p);


        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(p,"饭");

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
