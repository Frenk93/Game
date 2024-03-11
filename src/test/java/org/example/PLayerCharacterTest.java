package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * Write a test that ensures the method getX in the class PlayerCharacter returns the value 0.
 * Initially, the player should always be positioned in the middle of the game field.
 */

class PLayerCharacterTest {

    @Test
    void getX_shouldGivenZeroWhenGivenInt0(){
        //GIVEN
        int a = 0;
        //WHEN
        int expected = 0;
        int actual = PlayerCharacter.getX(a);
        //THEN
        Assertions.assertEquals(expected, actual);

    }
}