package org.example;

public class Visitor {
    private int age;

    public Visitor(final int age) {
        this.age = age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
