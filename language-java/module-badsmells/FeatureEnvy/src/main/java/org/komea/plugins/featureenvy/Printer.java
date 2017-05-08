/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.komea.plugins.featureenvy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rgalerme
 */
public class Printer {

    public void printList(List<String> list) {
        System.out.println("debut affichage list");
        for (String string : list) {
            System.out.println("element : " + string);
        }

    }

    public TraitementBaseChaine getTraitementWithList(List<String> chaine) {
        StringBuilder builder = new StringBuilder();
        for (String string : chaine) {
            builder.append(string);
        }
        return new TraitementBaseChaine(builder.toString());
    }

    public String afficherFichier(String path, String... ext) {

        TraitementBaseChaine trBase = new TraitementBaseChaine(path);
        for (String string : ext) {
            trBase.addEndSelect(string);
        }
        trBase.setSpliter("/");

        List<String> build = trBase.build();
        String get="";
        if (!build.isEmpty()) {
            get = build.get(build.size() - 1);
            System.out.println("le nom du fichier est : " + get);

        }
        return get;
    }

    public String afficherFichierAvecExclusion(String path, String _exclusion, String... ext) {
        TraitementBaseChaine trBase = new TraitementBaseChaine(path);
        StringBuilder cache = new StringBuilder();

        for (int i = 0; i < _exclusion.length(); i++) {
            cache.append("*");
        }

        for (String string : ext) {
            trBase.addEndSelect(string);
        }
        trBase.setSpliter("/");

        List<String> build = trBase.build();
        List<String> result = new ArrayList<String>();

        for (String string : build) {
            if (string.contains(_exclusion)) {
                string = string.replace(_exclusion, cache.toString());
            }
            result.add(string);
        }
        String get="";
        if (!result.isEmpty()) {
            get = result.get(result.size() - 1);
            System.out.println("le nom du fichier est : " + get);
        }
        return get;
    }

}
