package module03JavaWeb.day01.domain;

public class Person {
    private String name;
    private int age;

    public String a;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                '}';
    }

    public void eat(){
        System.out.println("...");
    }
    public void eat(String food){
        System.out.println(food);
    }
}
