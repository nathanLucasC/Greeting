package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetMiddleCharTest {

    GetMiddleCharTest(){
    }

    @Test
    @DisplayName("test")
    public void firstTest(){
        String expected = "bb";
        String result = GetMiddleChar.getMiddle("abba");
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("test2")
    public void secondTest(){
        String expected = "s";
        String result = GetMiddleChar.getMiddle("Milestone");
        Assertions.assertEquals(expected, result);
    }



}