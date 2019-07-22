/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author H. Narech
 */
public class Portefeuille {
    List<Monnaie> monnaies;

    public Portefeuille() {
        this.monnaies = new ArrayList<Monnaie>();
    }

    public List<Monnaie> getMonnaies() {
        return monnaies;
    }

  
   public void ajouterMonnaie(Monnaie m) throws DeviseInvalideException{
        if(this.monnaies.isEmpty()){
            this.monnaies.add(m);
        }else{
            for(int i=0; i<monnaies.size();i++){
                if(this.monnaies.get(i).getDevise().equals(m.getDevise())){
                    this.monnaies.get(i).ajouter(m);
                    break;
                }else{
                   this.monnaies.add(m);
                   break;
                }
            }
        } 
   }

    
    public int calculerMontantPortefeuille() throws DeviseInvalideException{
        int totalPortefeuille = 0;
        if(this.monnaies.isEmpty()){
            System.out.println("Aucune monnaie dans le portefeuille");
        }else{
            for(int i=0; i<monnaies.size();i++){
               int montantCFA = 0;
               switch (monnaies.get(i).getDevise()) {
                    case "cfa":  
                        montantCFA = monnaies.get(i).getValeur();
                        break;
                    case "euro":  
                        montantCFA = 655*monnaies.get(i).getValeur();
                        break;
                    case "dollar us":  
                        montantCFA = 573*monnaies.get(i).getValeur();
                        break;
                    case "yen japonnais":  
                        montantCFA = 5*monnaies.get(i).getValeur();
                        break;
                    case "livre ":  
                        montantCFA = 761*monnaies.get(i).getValeur();
                        break;
                    case "franc suisse":  
                        montantCFA = 575*monnaies.get(i).getValeur();
                        break;
                    case "dollar canadien":  
                        montantCFA = 435*monnaies.get(i).getValeur();
                        break;
                    case "yuan chinois":  
                        montantCFA = 85*monnaies.get(i).getValeur();
                        break;
                    case "dirham ":  
                        montantCFA = 155*monnaies.get(i).getValeur();
                        break;
                    default: 
                        break;
                }
                totalPortefeuille += montantCFA;
            }
        } 
        return totalPortefeuille;
   }
    
    
    
    
}
