package me.cooper.rick.hackerrank.inheritance.model;

class Person {

    private final int idNumber;
    private String firstName;
    private String lastName;

    Person(int idNumber, String firstName, String lastName) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, %s%nID: %d", lastName, firstName, idNumber);
    }

    public void printPerson() {
        System.out.println(this);
    }

}
