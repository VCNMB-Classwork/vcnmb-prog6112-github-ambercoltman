/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import com.mycompany.prjunittest2ndsemester.Guessing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author lab_services_student
 */
public class TestWord2 {
    
  
    //Test word array has the correct data inside
    //Test the guess method that will have word inside that is true
    //Test the guess method that does not have the word inside that returns false 
    private Guessing guessing;
    
    @BeforeEach
    public void setUp()
    {
        guessing = new Guessing();
        
    }
    
    @Test
    public void testWordArrayHasCorrectData()
    {
        String[] expectedWords = {"cat", "dog", "mouse"};
        assertArrayEquals(expectedWords, guessing.getWords(), "The word array does not contain the expected word");
    }
    
    @Test
    public void twstGuessMethodWithCorrectWord()
    {
        assertTrue(guessing.TestWord("cat"), "The guess method should return true for a word that is in the array");
    }
    
    @Test
    public void testGuessMethodWithIncorrectWord()
    {
        assertFalse(guessing.TestWord("elephant"), "The guess method should return false for a word that is not in the array");
    }
    
}
