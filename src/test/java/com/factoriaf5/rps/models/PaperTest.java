package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaperTest {
    
    @Test
    public void creationPaper() {
        
        MaterialFactory factory = new MaterialFactory();
        Material paper = factory.createMaterial("Paper");
        assertEquals(true, paper instanceof Paper);
    }
}
