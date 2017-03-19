package com.zlrx.javadevzed.antipattern.pyramidofdoom.pojo;

public class City {

    private final String name;
    private final Integer zip;

    public City(String name, Integer zip) {
        this.name = name;
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public Integer getZip() {
        return zip;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", zip=" + zip +
                '}';
    }
}
