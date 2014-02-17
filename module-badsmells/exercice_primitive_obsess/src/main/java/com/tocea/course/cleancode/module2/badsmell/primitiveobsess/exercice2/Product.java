
package com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice2;



public class Product
{
    
    
    private double price;
    
    
    private String name;
    
    
    
    public Product() {
    
    
    }
    
    
    /**
     * @param _price
     * @param _name
     */
    public Product(final String _name, final double _price) {
    
    
        super();
        price = _price;
        name = _name;
    }
    
    
    public String getName() {
    
    
        return name;
    }
    
    
    public double getPrice() {
    
    
        return price;
    }
    
    
    public void setName(final String _name) {
    
    
        name = _name;
    }
    
    
    public void setPrice(final double _price) {
    
    
        price = _price;
    }
    
}
