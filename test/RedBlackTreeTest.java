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
public class RedBlackTreeTest {
    
    public RedBlackTreeTest() {
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
     * Test of insert method, of class RedBlackTree.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Comparable item = null;
        RedBlackTree instance = null;
        instance.insert(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class RedBlackTree.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Comparable x = null;
        RedBlackTree instance = null;
        instance.remove(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMin method, of class RedBlackTree.
     */
    @Test
    public void testFindMin() {
        System.out.println("findMin");
        RedBlackTree instance = null;
        Comparable expResult = null;
        Comparable result = instance.findMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMax method, of class RedBlackTree.
     */
    @Test
    public void testFindMax() {
        System.out.println("findMax");
        RedBlackTree instance = null;
        Comparable expResult = null;
        Comparable result = instance.findMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class RedBlackTree.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Comparable x = null;
        RedBlackTree instance = null;
        Comparable expResult = null;
        Comparable result = instance.find(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeEmpty method, of class RedBlackTree.
     */
    @Test
    public void testMakeEmpty() {
        System.out.println("makeEmpty");
        RedBlackTree instance = null;
        instance.makeEmpty();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class RedBlackTree.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        RedBlackTree instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTree method, of class RedBlackTree.
     */
    @Test
    public void testPrintTree() {
        System.out.println("printTree");
        RedBlackTree instance = null;
        instance.printTree();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotateWithLeftChild method, of class RedBlackTree.
     */
    @Test
    public void testRotateWithLeftChild() {
        System.out.println("rotateWithLeftChild");
        RedBlackNode k2 = null;
        RedBlackNode expResult = null;
        RedBlackNode result = RedBlackTree.rotateWithLeftChild(k2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotateWithRightChild method, of class RedBlackTree.
     */
    @Test
    public void testRotateWithRightChild() {
        System.out.println("rotateWithRightChild");
        RedBlackNode k1 = null;
        RedBlackNode expResult = null;
        RedBlackNode result = RedBlackTree.rotateWithRightChild(k1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
