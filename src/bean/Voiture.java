/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author µµ
 */
public class Voiture {
   private String marque;
   private String modele;
   private double matricule;
   private double kilometrage;
   private String typeCarburant;
   private double dateMiseCirculation;

  
   
    public Voiture() {
    }

    public Voiture(String marque) {
        this.marque = marque;
    }

    public Voiture(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    public Voiture(String marque, String modele, double matricule) {
        this.marque = marque;
        this.modele = modele;
        this.matricule = matricule;
    }

    public Voiture(String marque, String modele, double matricule, double kilometrage) {
        this.marque = marque;
        this.modele = modele;
        this.matricule = matricule;
        this.kilometrage = kilometrage;
    }

    public Voiture(String marque, String modele, double matricule, double kilometrage, String typeCarburant) {
        this.marque = marque;
        this.modele = modele;
        this.matricule = matricule;
        this.kilometrage = kilometrage;
        this.typeCarburant = typeCarburant;
    }

    

    @Override
    public String toString() {
        return "Voiture{" + "marque=" + marque + ", modele=" + modele + ", matricule=" + matricule + ", kilometrage=" + kilometrage + ", typeCarburant=" + typeCarburant + ", dateMiseCirculation=" + dateMiseCirculation + '}';
    }

   
    
    
    
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getMatricule() {
        return matricule;
    }

    /**
     *
     * @param matricule
     */
    public void setMatricule(double matricule) {
        this.matricule = matricule;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(String typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

    public double getDateMiseCirculation() {
        return dateMiseCirculation;
    }

    public void setDateMiseCirculation(double dateMiseCirculation) {
        this.dateMiseCirculation = dateMiseCirculation;
    }
    
    
    
    
  
}
