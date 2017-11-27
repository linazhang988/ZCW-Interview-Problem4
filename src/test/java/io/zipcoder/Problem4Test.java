package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem4Test {
    @Test
    public void testCanFormPalindrome(){
        boolean expected = true;
        boolean actual = Problem4.canFormPalindrome("aaabbbb");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testCanFormPalindrome2(){
        boolean expected = false;
        boolean actual= Problem4.canFormPalindrome("cdefghmnopqrstuvw");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testCanFormPalindrome3(){
        boolean expected = true;
        boolean actual = Problem4.canFormPalindrome("cdcdcdcdeeeef");
        Assert.assertEquals(expected,actual);
    }
}
