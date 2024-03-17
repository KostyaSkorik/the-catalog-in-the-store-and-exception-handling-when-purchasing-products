package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int budget;

    public Person(String firstName, String lastName, int age,int budget) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.budget=budget;

    }

    public Person() {

    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
