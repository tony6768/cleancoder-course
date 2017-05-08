/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.komea.plugins.featureenvy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rgalerme
 */
public class TraitementBaseChaine {

    private String input;
    private List<String> filtres;
    private String spliter;
    private List<String> beginSelect;
    private List<String> endSelect;

    public String getInput() {
        return input;
    }

    public List<String> getFiltres() {
        return filtres;
    }

    public String getSpliter() {
        return spliter;
    }

    public List<String> getBeginSelect() {
        return beginSelect;
    }

    public List<String> getEndSelect() {
        return endSelect;
    }

    public TraitementBaseChaine(String input) {
        this.input = input;
        this.filtres = new ArrayList<String>();
        this.beginSelect = new ArrayList<String>();
        this.endSelect = new ArrayList<String>();
    }

    public void addFilterString(String _chaine) {
        this.filtres.add(_chaine);
    }

    public void setSpliter(String _chaine) {
        this.spliter = _chaine;
    }

    public void addEndSelect(String _chaine) {
        this.endSelect.add(_chaine);
    }

    public void addBeginSelect(String _chaine) {
        this.beginSelect.add(_chaine);
    }

    public List<String> build() {
        List<String> result;
        String chaineR = this.input;
        // application des filtres
        for (String string : this.filtres) {
            chaineR = chaineR.replace(string, "");
        }

        // application des spliters
        String[] split = chaineR.split(this.spliter);
        result = new ArrayList<String>();
        // application des begin et des end
        boolean valid, add;
        for (String string : split) {
            add = true;
            valid = false;
            if (!this.beginSelect.isEmpty()) {
                for (String string1 : this.beginSelect) {
                    if (string.startsWith(string1)) {
                        valid = true;
                    }
                }
                if (!valid && !"".equals(string)) {
                    add = false;
                }
            }

            valid = false;
            if (!this.endSelect.isEmpty()) {

                for (String string1 : this.endSelect) {
                    if (string.endsWith(string1)) {
                        valid = true;
                    }
                }
                if (!valid && !"".equals(string)) {
                    add = false;
                }
            }
            if (add) {
                result.add(string);
            }
        }

        return result;
    }

}
