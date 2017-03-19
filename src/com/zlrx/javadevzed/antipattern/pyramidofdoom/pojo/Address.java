package com.zlrx.javadevzed.antipattern.pyramidofdoom.pojo;

public class Address {

    private final City city;
    private final String street;
    private final Integer houseNumber;

    public Address(City city, String street, Integer houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public City getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city=" + city +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
