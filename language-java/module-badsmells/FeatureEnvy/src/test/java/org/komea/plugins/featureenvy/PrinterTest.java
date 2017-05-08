/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.komea.plugins.featureenvy;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * 
 * @author rgalerme
 */
public class PrinterTest {

	@Test
	public void testPrintList() {
		Printer printer = new Printer();
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("chaine 1 ");
		arrayList.add("chaine 2 ");
		arrayList.add("chaine 3 ");
		printer.printList(arrayList);
	}

	@Test
	public void testGetTraitementWithList() {
		Printer printer = new Printer();
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("chaine 1 ");
		arrayList.add(" || ");
		arrayList.add("chaine 2 ");
		arrayList.add(" || ");
		arrayList.add("chaine 3 ");
		TraitementBaseChaine traitementWithList = printer
				.getTraitementWithList(arrayList);
		Assert.assertEquals(
				"la représentation des données insérés avec la méthodes getTraitemntWithList n'est pas correcte",
				traitementWithList.getInput(),
				"chaine 1  || chaine 2  || chaine 3 ");

	}

	@Test
	public void testAfficherFichier() {
		Printer printer = new Printer();
		String afficherFichier = printer.afficherFichier(
				"/home/user/worspace/test.java", "java");
		Assert.assertEquals(
				"erreur la construction de tratementBasChaine ou l'affichage de affichierFichier est incorecte",
				afficherFichier, "test.java");

	}

	@Test
	public void testAfficherFichierAvecExclusion() {
		Printer printer = new Printer();
		String afficherFichierAvecExclusion = printer
				.afficherFichierAvecExclusion("/home/user/workspace/test.java",
						"ava", "java");
		Assert.assertEquals(
				"erreur la construction de tratementBasChaine ou l'affichage de affichierFichierAvecExclusion est incorecte",
				afficherFichierAvecExclusion, "test.j***");
	}

}
