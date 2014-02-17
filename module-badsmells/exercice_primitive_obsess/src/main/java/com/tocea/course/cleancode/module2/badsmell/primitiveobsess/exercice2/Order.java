
package com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice2;



import java.util.ArrayList;
import java.util.List;



public class Order
{
    
    
    private final List<ProductOrder> productOrders = new ArrayList<ProductOrder>();
    
    
    
    public Order() {
    
    
        super();
    }
    
    
    public void addOrder(final ProductOrder _order) {
    
    
        productOrders.add(_order);
    }
    
    
    public List<ProductOrder> getProductOrders() {
    
    
        return productOrders;
    }
    
}
