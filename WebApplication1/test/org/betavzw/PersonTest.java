/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.betavzw;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jef
 */
public class PersonTest {
    
    public PersonTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testSetName(){
        String oracleName = "Joske";
        Person p = new Person();
        p.setName(oracleName);
        String result = p.getName();
        assertEquals(oracleName, result);                
    }
    @Test(expected = IllegalArgumentException.class)
    public void testNotEmptyName(){
        String oracleName = "";
        Person p = new Person();
        p.setName(oracleName);
    }
}
