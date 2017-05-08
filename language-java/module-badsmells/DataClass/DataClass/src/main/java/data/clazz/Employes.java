/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.clazz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rgalerme
 */
public class Employes {

    private List<Personne> personne;
    private List<Poste> poste;
     
   	// information qui lie une personne a une poste, un poste peux être occuper par plusieur personnes
    private Map<Integer, Integer> relation;

    public Employes() {
        this.personne = new ArrayList<Personne>();
        this.poste = new ArrayList<Poste>();
        this.relation = new HashMap<Integer, Integer>();

    }

    public List<Personne> getPersonne() {
        return personne;
    }

    public void setPersonne(List<Personne> personne) {
        this.personne = personne;
    }

    public List<Poste> getPoste() {
        return poste;
    }

    public void setPoste(List<Poste> poste) {
        this.poste = poste;
    }

    public Map<Integer, Integer> getRelation() {
        return relation;
    }

    public void setRelation(Map<Integer, Integer> relation) {
        this.relation = relation;
    }

    
}
