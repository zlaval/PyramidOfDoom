package com.zlrx.javadevzed.antipattern.pyramidofdoom.generator;

import com.zlrx.javadevzed.antipattern.pyramidofdoom.pojo.City;

import java.util.function.Supplier;

public class CityGenerator {

    public static City generateCity(Supplier<City> citySupplier) {
        //TODO assume, common logic happens before and after get
        return citySupplier.get();
    }

}
