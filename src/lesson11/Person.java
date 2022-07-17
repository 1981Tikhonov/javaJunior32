package lesson11;

import java.util.ArrayList;
import java.util.List;

public abstract class Person extends Object {
    private String name;
    private int age;



    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Person person){
        return this.name.equals(person.name);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }


    //    public String toString(int age) {
//        return "name: " + name + "age" + age;
//
//    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract String test();
//
//    String test(){
//        return "ok";
//    }






}
