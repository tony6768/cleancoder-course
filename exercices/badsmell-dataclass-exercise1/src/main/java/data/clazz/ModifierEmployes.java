/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.clazz;

/**
 *
 * @author rgalerme
 */
public class ModifierEmployes {

    public void ajoutPersonne(Employes employer, Personne personne) {
        employer.getPersonne().add(personne);
    }

    public void ajoutPoste(Employes employer, Poste poste) {
        employer.getPoste().add(poste);
    }

    public void attachPoste(Employes employer, Personne personne, Poste poste) {
        employer.getRelation().put(personne.getId(), poste.getId());
    }

    public void supprimerPersonne(Employes employer, Personne personne) {
        employer.getRelation().remove(personne.getId());
        employer.getPersonne().remove(personne);

    }
    public void supprimerPoste(Employes employer, Poste poste) {
        employer.getPoste().remove(poste);

    }

}
