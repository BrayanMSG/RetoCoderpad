package com.tuusuario.quantum.runners;

import io.karatelabs.junit6.Karate;;

public class PetStoreRunner {

    @Karate.Test
    Karate testPetStore() {
        return Karate.run("classpath:features/petstore.feature");
    }
}