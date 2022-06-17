package lesson5.HW;

import java.util.Objects;

public class Person {
    String name;
    int age;

    Person() {
        name = "";
        age = 0;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    public void sayName() {
        System.out.println(name);
    }

    public void incAge() {
        age++;
    }

    public String turnIntoString() {
        return name + " " + age;
    }

    @Override
    public String toString() {
        return "This is beautiful person. Her name is " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
