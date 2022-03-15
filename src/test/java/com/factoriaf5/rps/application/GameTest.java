package com.factoriaf5.rps.application;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {
    
    @Test
    public void justASimpleTest() {
        assertTrue(true);
    }

    @Test
    public void rockWinScissors() {

        MaterialFactory factory = new MaterialFactory();
        Material playerOne = factory.createMaterial("R");
        Material playerTwo = factory.createMaterial("S");

        String result = Game.checkAndShowWinner(playerOne, playerTwo);

        assertEquals("Piedra gana a Tijeras", result);
        
    }
}