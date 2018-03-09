package com.example.examplestatemachine;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StateMachineTest {
    StateContext sc;
    
    @Before
    public void setUp() {
        sc = new StateContext();
    }
    
    /*
     * Test Sequence: A
     */
    @Test
    public void test_1() {
        sc.actionA();
        assertTrue(sc.isAccept());
    }
    
    /*
     * Test Sequence: B
     */
    @Test
    public void test_2() {
        sc.actionB();
        assertTrue(sc.isAccept());
    }
    
    /*
     * Test Sequence: ABABA
     */
    @Test
    public void test_3() {
        sc.actionA();
        assertTrue(sc.isAccept());
        sc.actionB();
        assertFalse(sc.isAccept());
        sc.actionA();
        assertTrue(sc.isAccept());
        sc.actionB();
        assertFalse(sc.isAccept());
        sc.actionA();
        assertTrue(sc.isAccept());
    }
    
    /*
     * Test Sequence: BAB
     */
    @Test
    public void test_4() {
        sc.actionB();
        sc.actionA();
        sc.actionB();
        assertTrue(sc.isAccept());
    }
    
    /*
     * Test Sequence: AAB
     */
    @Test
    public void test_5() {
        sc.actionA();
        sc.actionA();
        sc.actionB();
        assertFalse(sc.isAccept());
    }
    
    /*
     * Test Sequence: BAA
     */
    @Test
    public void test_6() {
        sc.actionB();
        sc.actionA();
        sc.actionA();
        assertFalse(sc.isAccept());
    }
    
    /*
     * Test Sequence: ABA
     */
    @Test
    public void test_7() {
    		sc.actionA();
    		sc.actionB();
    		sc.actionA();
    		assertTrue(sc.isAccept());
    }
    
    /*
     * Test Sequence: ABBA
     */
    @Test
    public void test_8() {
    		sc.actionA();
    		sc.actionB();
    		sc.actionB();
    		sc.actionA();
    		assertTrue(sc.isAccept());
    }
    
    /*
     * Test Sequence: BAAB
     */
    @Test
    public void test_9() {
    		sc.actionB();
    		sc.actionA();
    		sc.actionA();
    		sc.actionB();
    		assertTrue(sc.isAccept());
    }
    
    /*
     * Test Sequence: AB
     */
    @Test
    public void test_10() {
    		sc.actionA();
    		sc.actionB();
    		assertFalse(sc.isAccept());
    }
    
    /*
     * Test Sequence: ABAB
     */
    public void test_11() {
    		sc.actionA();
    		sc.actionB();
    		sc.actionA();
    		sc.actionB();
    		assertFalse(sc.isAccept());
    }
    
    /*
     * Test Sequence: BABA
     */
    public void test_12() {
    		sc.actionB();
    		sc.actionA();
    		sc.actionB();
    		sc.actionA();
    		assertFalse(sc.isAccept());
    }
    
    
    
    
    
    
    
    
    
}
