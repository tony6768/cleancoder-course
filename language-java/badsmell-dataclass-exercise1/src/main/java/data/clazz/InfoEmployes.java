/*
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
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

    // Avec l'identifiant de la personnes passé en parametre on récupère
    // l'identifiant du poste associer grace a la table des relations
    /**
     * Gets the poste.
     *
     * @param personne
     *            the personne
     * @return the poste
     */
    // Ensuite on parcourt la liste des postes pour trouve celui correspondant
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
    // Avec cette liste on recupère les identifiant des personnes pour le poste
    // passé en parametre
    // Enfin on parcour la liste des personnes pour trouver celle qui sont
    // associer a cet identifiant
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
	throw new UnsupportedOperationException("Not supported yet."); // To
	                                                               // change
	                                                               // body
	                                                               // of
	                                                               // generated
	                                                               // methods,
	                                                               // choose
	                                                               // Tools
	                                                               // |
	                                                               // Templates.
    }

}
