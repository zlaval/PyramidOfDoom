package com.zlrx.javadevzed.antipattern.pyramidofdoom.generator;

import com.zlrx.javadevzed.antipattern.pyramidofdoom.pojo.Address;

import java.util.function.Supplier;

public class AddressGenerator {

    public static Address generateAddress(Supplier<Address> addressSupplier) {
        //TODO assume, common logic happens before and after get
        return addressSupplier.get();
    }

}
