/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import models.DeviseInvalideException;
import models.Monnaie;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author H. Narech
 */
public class MonnaieTest {
    
    public MonnaieTest() {
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
    
    @Test
    public void testajouter() throws DeviseInvalideException {
        Monnaie monnaie1 = new Monnaie(100,"cfa");
        Monnaie monnaie2 = new Monnaie(200,"cfa");
        monnaie1.ajouter(monnaie2);
        assertEquals(300,monnaie1.getValeur());
    }
    
    @Test
    public void testretrancher() throws DeviseInvalideException {
        Monnaie M = new Monnaie(100,"cfa");
        Monnaie m = new Monnaie(200,"cfa");
        m.retrancher(M);
        assertEquals(100,m.getValeur());
    }
    
     @Test
    public void testMonnaie()  {
        Monnaie monnaie = new Monnaie(100,"cfa");
        assertEquals(100,monnaie.getValeur());
    }
    
    @Test
    public void testgetValeur()  {
        Monnaie monnaie = new Monnaie(100,"cfa");
        assertEquals(100,monnaie.getValeur());
    }
    
    @Test
    public void testgetDevise()  {
        Monnaie monnaie = new Monnaie(100,"cfa");
        assertEquals("cfa",monnaie.getDevise());
    }
    
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
