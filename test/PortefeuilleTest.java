/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import models.DeviseInvalideException;
import models.Monnaie;
import models.Portefeuille;
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
public class PortefeuilleTest {
    
    public PortefeuilleTest() {
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
    public void testajouterMonnaie() throws DeviseInvalideException {
        Monnaie newMonnaie = new Monnaie(200,"cfa");
        Portefeuille portefeuille = new Portefeuille();
        portefeuille.ajouterMonnaie(newMonnaie);
        assertEquals(200,portefeuille.getMonnaies().get(0).getValeur());
    }
    
    @Test
    public void calculerMontantPortefeuille() throws DeviseInvalideException {
        Monnaie newMonnaie = new Monnaie(200,"cfa");
        Monnaie newMonnaie1 = new Monnaie(100,"dollar us");
        Portefeuille portefeuille = new Portefeuille();
        portefeuille.ajouterMonnaie(newMonnaie);
        portefeuille.ajouterMonnaie(newMonnaie1);
        assertEquals(57500,portefeuille.calculerMontantPortefeuille());
    }

}
