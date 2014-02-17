
package com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice2;



public class ProductOrder
{
    
    
    private Product product;
    
    
    private int     amount;
    
    
    
    public ProductOrder() {
    
    
        super();
    }
    
    
    /**
     * @param _product
     * @param _amount
     */
    public ProductOrder(final Product _product, final int _amount) {
    
    
        super();
        product = _product;
        amount = _amount;
    }
    
    
    public int getAmount() {
    
    
        return amount;
    }
    
    
    public Product getProduct() {
    
    
        return product;
    }
    
    
    public void setAmount(final int _amount) {
    
    
        amount = _amount;
    }
    
    
    public void setProduct(final Product _product) {
    
    
        product = _product;
    }
    
}
