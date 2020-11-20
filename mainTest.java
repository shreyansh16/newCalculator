/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shreyansh
 */
public class mainTest {
    
    public mainTest() {
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
     * Test of add method, of class main.
     */
    @Test
    public void testAdd() {
        
        main obj = new main();
        String nums="//;1;2;3";
        int sum=obj.add(nums);
        Assert.assertEquals(6,sum);
    }
    
    @Test
    public void testAdd1() {
        
        main obj = new main();
        String nums="//,\n,1,2,3";
        int sum=obj.add(nums);
        Assert.assertEquals(0,sum);
    }
    
}
