/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author H. Narech
 */
public class Monnaie {
    private int valeur;
    private String devise;

    public Monnaie(int valeur, String devise) {
        this.valeur = valeur;
        this.devise = devise;
    }
    
     private boolean verifierMemesDevises(Monnaie autre) {
            boolean status = false;
            if(this.devise.equals(autre.devise)){
                status = true; 
            }else{
              status = false;  
            }
            return status;
    }
    
    public void ajouter(Monnaie autre) throws DeviseInvalideException {
        
            if(this.verifierMemesDevises(autre)){
                this.valeur += autre.valeur;
                System.out.println("succes ajouter");
                  
             }else{
                //TO DO EXEPTION
                   throw new DeviseInvalideException("Echec de l'opération, ces monnaies n'ont pas les memes devises!");
  
            }
    }
    
 
            
       

   public void retrancher(Monnaie autre) throws DeviseInvalideException {
        
            if(this.verifierMemesDevises(autre)){
                if(this.valeur > autre.valeur){
                    this.valeur-=autre.valeur;
                    System.out.println("succes retrancher");
              }
            else{
                   System.out.println("Impossible de retrancher "+ autre.valeur + " à "+this.valeur);
               }
               
             }else{
                //TO DO EXEPTION
                
                    throw new DeviseInvalideException("Echec de l'opération, ces monnaies n'ont pas les memes devises!");
  
                 
            }
            
    }

    public int getValeur() {
        return valeur;
    }

 

    public String getDevise() {
        return devise;
    }

    
    
    
}
