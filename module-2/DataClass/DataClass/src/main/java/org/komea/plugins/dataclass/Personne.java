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
public class Personne {

    private int age;
    private String name;
    private Integer id;
    private boolean genre;

    public Personne(int age, String name, Integer id, boolean genre) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.genre = genre;
    }

    
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isGenre() {
        return genre;
    }

    public void setGenre(boolean genre) {
        this.genre = genre;
    }

}
