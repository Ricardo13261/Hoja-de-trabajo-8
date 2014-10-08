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
public class SplayTreeTest {
    
    public SplayTreeTest() {
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
     * Test of insert method, of class SplayTree.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Comparable x = null;
        SplayTree instance = new SplayTree();
        instance.insert(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class SplayTree.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Comparable x = null;
        SplayTree instance = new SplayTree();
        Comparable expResult = null;
        Comparable result = instance.find(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class SplayTree.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SplayTree instance = new SplayTree();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotateWithLeftChild method, of class SplayTree.
     */
    @Test
    public void testRotateWithLeftChild() {
        System.out.println("rotateWithLeftChild");
        BinaryNode k2 = null;
        BinaryNode expResult = null;
        BinaryNode result = SplayTree.rotateWithLeftChild(k2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotateWithRightChild method, of class SplayTree.
     */
    @Test
    public void testRotateWithRightChild() {
        System.out.println("rotateWithRightChild");
        BinaryNode k1 = null;
        BinaryNode expResult = null;
        BinaryNode result = SplayTree.rotateWithRightChild(k1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
