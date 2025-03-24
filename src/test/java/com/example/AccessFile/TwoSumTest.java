package com.example.AccessFile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    public void  testTwoSum(){
        TwoSum sum = new TwoSum();
       int actual =  sum.addNumbers(1, 2);
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void  testTwoSumOnePos(){
        TwoSum sum = new TwoSum();
        int actual =  sum.addNumbers(1, -2);
        Assertions.assertEquals(-1, actual);
    }
    @Test
    public void  testTwoSum3(){
        TwoSum sum = new TwoSum();
        int actual =  sum.addNumbers(-1, -2);
        Assertions.assertEquals(-3, actual);
    }
}
