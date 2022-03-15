package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockTest {

    @Test
    public void creationRock() {
        MaterialFactory factory = new MaterialFactory();
        Material rock = factory.createMaterial("Rock");
        assertEquals(true, rock instanceof Rock);
    }
}
