/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.komea.plugins.dataclass;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rgalerme
 */
public class EmployesTest {

    @Test
    public void testEmployes() {
        System.out.println("test");
        Employes employes = new Employes();

        ModifierEmployes memployes = new ModifierEmployes();

        Personne p1 = new Personne(25, "martin orges", Integer.valueOf(1), true);
        Personne p2 = new Personne(35, "pierre jean", Integer.valueOf(2), true);
        Personne p3 = new Personne(28, "endre sanfrape", Integer.valueOf(3), false);
        Personne p4 = new Personne(47, "martine laterrine", Integer.valueOf(4), false);

        Poste r1 = new Poste(29500, Integer.valueOf(1), "Commercial");
        Poste r2 = new Poste(49500, Integer.valueOf(2), "Sous directeur");
        Poste r3 = new Poste(31500, Integer.valueOf(3), "Developpeur");

        memployes.addPersonne(employes, p1);
        memployes.addPersonne(employes, p2);
        memployes.addPersonne(employes, p3);
        memployes.addPersonne(employes, p4);

        memployes.addPoste(employes, r1);
        memployes.addPoste(employes, r2);
        memployes.addPoste(employes, r3);

        memployes.attachPoste(employes, p1, r1);
        memployes.attachPoste(employes, p2, r2);
        memployes.attachPoste(employes, p3, r3);
        memployes.attachPoste(employes, p4, r3);

        InfoEmployes rinfo = new InfoEmployes(employes);
        List<Personne> personne = rinfo.getPersonne(r3);

        Assert.assertEquals(2, personne.size());
        Assert.assertEquals(personne.get(0).isGenre(), false);
        Assert.assertEquals(personne.get(1).isGenre(), false);
        Poste poste = rinfo.getPoste(p1);

        Assert.assertEquals(1, poste.getId().intValue());

        memployes.supprimerPersonne(employes, p4);
        List<Personne> personne1 = rinfo.getPersonne(r3);

        Assert.assertEquals(1, personne1.size());
        
        memployes.supprimerPoste(employes, r2);
        Poste poste2 = rinfo.getPoste(p2);
         Assert.assertEquals(poste2, null);
        
    }

}
