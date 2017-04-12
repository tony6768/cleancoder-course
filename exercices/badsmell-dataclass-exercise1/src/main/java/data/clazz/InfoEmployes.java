/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.clazz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author rgalerme
 */
public class InfoEmployes {

    private Employes employes;

    public InfoEmployes(Employes employes) {
        this.employes = employes;
    }

    // Avec l'identifiant de la personnes passé en parametre on récupère l'identifiant du poste associer grace a la table des relations
    // Ensuite on parcour la liste des postes pour trouve celui correspondant
    public Poste getPoste(Personne personne) {
        Integer get = employes.getRelation().get(personne.getId());
        if (get != null) {
            List<Poste> poste = employes.getPoste();
            for (Poste poste1 : poste) {
                if (poste1.getId().equals(get)) {
                    return poste1;
                }
            }
        }
        return null;
    }
    // On récupère la liste des associations de poste et de personnes. 
    // Avec cette liste on recupère les identifiant des personnes pour le poste passé en parametre
    // Enfin on parcour la liste des personnes pour trouver celle qui sont associer a cet identifiant
    public List<Personne> getPersonne(Poste poste) {
        List<Personne> result = new ArrayList<Personne>();
        Set<Map.Entry<Integer, Integer>> entrySet = employes.getRelation().entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue().equals(poste.getId())) {
                List<Personne> personne = employes.getPersonne();
                for (Personne personne1 : personne) {
                    if (personne1.getId().equals(entry.getKey())) {
                        result.add(personne1);
                    }
                }
            }
        }

        return result;
    }

    void getPoste(Poste r1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
