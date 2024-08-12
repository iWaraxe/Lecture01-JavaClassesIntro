package com.coherentsolutions.java.section04;

/**
 * Traditional class equivalent to a record, used for demonstrating the verbosity in traditional POJOs.
 */
public class Ex02TraditionalPerson {
    private final String name;
    private final int age;

    public Ex02TraditionalPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ex02TraditionalPerson that = (Ex02TraditionalPerson) o;
        return age == that.age && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }

    @Override
    public String toString() {
        return "TraditionalPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Ex02TraditionalPerson person = new Ex02TraditionalPerson("John Doe", 30);
        System.out.println(person);
    }
}
