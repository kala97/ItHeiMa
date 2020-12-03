package module03JavaWeb.day01.reflect;

import module03JavaWeb.day01.domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception{
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor(String.class,int.class);
        System.out.println(constructor);
        //创建对象
        Person person = constructor.newInstance("张三", 23);
        System.out.println(person);
        personClass.getDeclaredConstructor().newInstance();
    }
}
