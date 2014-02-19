/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.clazz;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import data.clazz.Employes;
import data.clazz.InfoEmployes;
import data.clazz.ModifierEmployes;
import data.clazz.Personne;
import data.clazz.Poste;

/**
 * 
 * @author rgalerme
 */
public class EmployesTest {

	private Employes employes;
	private ModifierEmployes memployes;
	private Personne martin;
	private Personne pierre;
	private Personne andre;
	private Personne martine;
	private Poste commercial;
	private Poste developer;
	private Poste sousDirector;
	private InfoEmployes rinfo;

	@Before
	public void setUp() {
		employes = new Employes();

		memployes = new ModifierEmployes();

		martin = new Personne(25, "martin orges", Integer.valueOf(1), true);
		pierre = new Personne(35, "pierre jean", Integer.valueOf(2), true);
		andre = new Personne(28, "andre sanfrape", Integer.valueOf(3), false);
		martine = new Personne(47, "martine laterrine", Integer.valueOf(4),
				false);

		commercial = new Poste(29500, 1, "Commercial");
		sousDirector = new Poste(49500, 2, "Sous directeur");
		developer = new Poste(31500, 3, "Developpeur");

		memployes.ajoutPersonne(employes, martin);
		memployes.ajoutPersonne(employes, pierre);
		memployes.ajoutPersonne(employes, andre);
		memployes.ajoutPersonne(employes, martine);

		memployes.ajoutPoste(employes, commercial);
		memployes.ajoutPoste(employes, sousDirector);
		memployes.ajoutPoste(employes, developer);

		memployes.attachPoste(employes, martin, commercial);
		memployes.attachPoste(employes, pierre, sousDirector);
		memployes.attachPoste(employes, andre, developer);
		memployes.attachPoste(employes, martine, developer);

		rinfo = new InfoEmployes(employes);

	}

	@Test
	public void testNombreDeDevelopeur() {
		System.out.println("test");

		List<Personne> personne = rinfo.getPersonne(developer);

		Assert.assertEquals(2, personne.size());

		memployes.supprimerPoste(employes, sousDirector);
		Poste poste2 = rinfo.getPoste(pierre);
		Assert.assertEquals(poste2, null);

	}

	@Test
	public void testSupprimerUnDevelopeur() {
		
		memployes.supprimerPoste(employes, sousDirector);
		Poste poste2 = rinfo.getPoste(pierre);
		Assert.assertNull(poste2);
	}
	
	@Test
	public void testSupprimerUnPoste() {
		memployes.supprimerPersonne(employes, martine);
		List<Personne> personne1 = rinfo.getPersonne(developer);

		Assert.assertEquals(1, personne1.size());
	}

	@Test
	public void testEstMartinUnCommercial() {

		Poste poste = rinfo.getPoste(martin);

		Assert.assertEquals(commercial, poste);

	}

}
