/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alejo
 */
public class HashMapSetTest {
    
    public HashMapSetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class HashMapSet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word wordObject = new Word("Alejo","Sustantivo");
        HashMapSet instance = new HashMapSet();
        instance.add(wordObject);
        Word expResult = instance.get(wordObject);
        assertEquals(expResult,wordObject);
    }

    /**
     * Test of get method, of class HashMapSet.
     */
    @Test
    public void testGet() {
       System.out.println("get");
        Word word = new Word("Alejo","Sustantivo");
        HashMapSet instance = new HashMapSet();
        instance.add(word);
        Word expResult = new Word("Alejo","Sustantivo");
        Word result = instance.get(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
