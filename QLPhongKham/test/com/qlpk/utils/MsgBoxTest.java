/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.utils;

import java.awt.Component;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author fptshop
 */
public class MsgBoxTest {
    
    public MsgBoxTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of alert method, of class MsgBox.
     */
    @Test
    public void testAlert() {
        System.out.println("alert");
        Component parent = null;
        String message = "";
        MsgBox.alert(parent, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirm method, of class MsgBox.
     */
    @Test
    public void testConfirm() {
        System.out.println("confirm");
        Component parent = null;
        String message = "";
        boolean expResult = false;
        boolean result = MsgBox.confirm(parent, message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prompt method, of class MsgBox.
     */
    @Test
    public void testPrompt() {
        System.out.println("prompt");
        Component parent = null;
        String message = "";
        String expResult = "";
        String result = MsgBox.prompt(parent, message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
