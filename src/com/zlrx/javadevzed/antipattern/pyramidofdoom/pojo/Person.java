package com.zlrx.javadevzed.antipattern.pyramidofdoom.pojo;

public class Person {

    private final String fullName;
    private final Integer yearOfBirth;
    private final Address address;

    public Person(String fullName, Integer yearOfBirth, Address address) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address=" + address +
                '}';
    }
}
