/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Voiture;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author µµ
 */
public class VoitureService {
    
    public List<Voiture> findByMarque(String marque, List<Voiture> voitures){
        List<Voiture> resultat=new ArrayList<Voiture>();
        for(int i = 0; i < voitures.size(); i++){
            Voiture c = voitures.get(i);
            if (c.getMarque().equals(marque)){
                resultat.add(c);
            }
        }
        return resultat;
    }
    
    public Voiture findByModele(String modele, ArrayList<Voiture> voitures){
        for(int a = 0; a < voitures.size(); a++){
            Voiture c = voitures.get(a);
            if (c.getModele().equals(modele)){
                return c;
            }
        }
        return null;
    }
    
   public Voiture findByTypeCarburant(String typeCarburant, ArrayList<Voiture> voitures){
       for(int a = 0; a < voitures.size(); a++){
           Voiture c = voitures.get(a);
           typeCarburant = null;
            if (c.getTypeCarburant().equals(typeCarburant)){
                return c;
            }
        }
        return null;
   }
   
   
}
