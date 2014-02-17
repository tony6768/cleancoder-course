
package com.tocea.course.cleancode.module2.badsmell.primitiveobsess;



import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice2.Order;
import com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice2.Product;
import com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice2.ProductOrder;
import com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice2.TaxComputation;



;


public class OrderTest
{
    
    
    /**
     * Refactoring : the tax management should be wrapped into an object.
     */
    @Test
    public void testOrder() {
    
    
        final Product productGirafon = new Product("Girafon", 100);
        final Product productLion = new Product("Lion", 500);
        final ProductOrder productGirafonOrder = new ProductOrder(productGirafon, 1);
        final ProductOrder productLionOrder = new ProductOrder(productLion, 10);
        final Order order = new Order();
        order.addOrder(productGirafonOrder);
        order.addOrder(productLionOrder);
        final TaxComputation taxComputation = new TaxComputation();
        
        double priceOrder = 0d;
        final BigDecimal taxRate = new BigDecimal(1.12d);
        for (final ProductOrder productOrder : order.getProductOrders()) {
            priceOrder +=
                    taxComputation.computeTaxedPrice(productOrder.getAmount()
                            * productOrder.getProduct().getPrice(), taxRate);
        }
        Assert.assertEquals(5712.0, priceOrder, 0);
        
    }
}
