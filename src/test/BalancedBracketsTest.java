package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //Test string with non-bracket characters
    //Rohini
    @Test
    public void onlyNonBracketChars() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Rohini"));
    }

    @Test
    public void stringWithBalancedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Rohini]"));
    }

    @Test
    public void stringWithMultipleBalancedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Rohini]]"));
    }

    @Test
    public void stringWithMultipleBalancedBracketsWords(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Rohini][Bhingardive]"));
    }

    @Test
    public void stringWithSingleImBalancedBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Rohini"));
    }

    @Test
    public void stringWithMultipleImBalancedBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Rohini]"));
    }

    @Test
    public void stringWithMultipleImBalancedBracketsWords(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Rohini][Bhingardive]"));
    }

    @Test
    public void stringWithSingleOpenBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void stringWithSingleClosedBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }


    @Test
    public void stringWithClosedBeforeOpenBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void stringWithClosedBeforeOpenBracketWithString(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Rohini["));
    }

}
