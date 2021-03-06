package com.zlrx.javadevzed.antipattern.pyramidofdoom;


import com.zlrx.javadevzed.antipattern.pyramidofdoom.pojo.Address;
import com.zlrx.javadevzed.antipattern.pyramidofdoom.pojo.City;
import com.zlrx.javadevzed.antipattern.pyramidofdoom.pojo.Person;

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
        Person person = generatePerson(() -> new Person("John Doe", 1990, getGeneratedAddress()));
        System.out.println(person);
    }

    private Address getGeneratedAddress() {
        return generateAddress(() ->
                new Address(getGeneratedCity(), "Cool streer", 7));
    }

    private City getGeneratedCity() {
        return generateCity(() -> new City("Noszlop", 8456));
    }

}
