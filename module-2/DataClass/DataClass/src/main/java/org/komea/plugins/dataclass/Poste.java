/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.komea.plugins.dataclass;

/**
 *
 * @author rgalerme
 */
public class Poste {

    private int salaire;
    private Integer id;
    private String intitule;

    public Poste(int salaire, Integer id, String intitule) {
        this.salaire = salaire;
        this.id = id;
        this.intitule = intitule;
    }
    
    

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }


    
    
}
