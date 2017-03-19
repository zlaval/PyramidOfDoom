package com.zlrx.javadevzed.antipattern.pyramidofdoom.generator;

import com.zlrx.javadevzed.antipattern.pyramidofdoom.pojo.Person;

import java.util.function.Supplier;

public class PersonGenerator {

    public static Person generatePerson(Supplier<Person> personSupplier) {
        //TODO assume, common logic happens before and after get
        return personSupplier.get();
    }

}
