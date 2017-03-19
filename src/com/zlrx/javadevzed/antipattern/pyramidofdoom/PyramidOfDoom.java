package com.zlrx.javadevzed.antipattern.pyramidofdoom;


import com.zlrx.javadevzed.antipattern.pyramidofdoom.pojo.Address;
import com.zlrx.javadevzed.antipattern.pyramidofdoom.pojo.City;
import com.zlrx.javadevzed.antipattern.pyramidofdoom.pojo.Person;

import java.util.function.Supplier;

import static com.zlrx.javadevzed.antipattern.pyramidofdoom.generator.AddressGenerator.generateAddress;
import static com.zlrx.javadevzed.antipattern.pyramidofdoom.generator.CityGenerator.generateCity;
import static com.zlrx.javadevzed.antipattern.pyramidofdoom.generator.PersonGenerator.generatePerson;

public class PyramidOfDoom {

    public static void main(String[] args) {
        PyramidOfDoom pyramidOfDoom = new PyramidOfDoom();
        pyramidOfDoom.podExample();
        pyramidOfDoom.refactoredExample();
    }


    public void podExample() {
        Person person = generatePerson(() -> {
            Address myPlace = generateAddress(() -> {
                City myFavoriteVillage = generateCity(() -> {
                    return new City("Noszlop", 8456);
                });
                return new Address(myFavoriteVillage, "Cool streer", 7);
            });
            return new Person("John Doe", 1990, myPlace);
        });
        System.out.println(person);
    }

    public void refactoredExample() {
        Person person = generatePerson(personSupplier());
        System.out.println(person);
    }

    private Address getGeneratedAddress() {
        return generateAddress(addressSupplier());
    }

    private City getGeneratedCity() {
        return generateCity(() ->
                new City("Noszlop", 8456));
    }

    private Supplier<Person> personSupplier() {
        return () ->
                new Person("John Doe", 1990, getGeneratedAddress());
    }

    private Supplier<Address> addressSupplier() {
        return () ->
                new Address(getGeneratedCity(), "Cool streer", 7);
    }

    private Supplier<City> citySupplier() {
        return () ->
                new City("Noszlop", 8456);
    }


}
