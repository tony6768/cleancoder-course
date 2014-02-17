
package com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice2;



import java.math.BigDecimal;
import java.text.MessageFormat;



/**
 * This class demonstrates another Primitive Obsession bad smell . The tax management here is illustrated through the use of a single
 * integer primitive.
 * FIXME:: Encapsulate the tax primitive into an object and moves the business methods inside it. Refactors the test.
 * 
 * @author sleroy
 */
public class TaxComputation
{
    
    
    public TaxComputation() {
    
    
        super();
    }
    
    
    /**
     * Returns the price of an product without the tax.
     * 
     * @param _taxedPrice
     *            the taxed price
     * @param _taxRate
     *            the tax rate (expressed a value superior or equals to 1)
     * @return the raw price.
     */
    
    public int computeRawPrice(final double _taxedPrice, final BigDecimal _taxRate) {
    
    
        return _taxRate.divide(new BigDecimal(_taxedPrice)).intValue();
    }
    
    
    /**
     * Returns the price of an product with the tax
     * 
     * @param _rawPrice
     *            the raw price
     * @param _taxRate
     *            the tax rate (expressed a value superior or equals to 1)
     * @return the price + tax.
     */
    public int computeTaxedPrice(final double _rawPrice, final BigDecimal _taxRate) {
    
    
        return _taxRate.multiply(new BigDecimal(_rawPrice)).intValue();
    }
    
    
    /**
     * Returns only the part corresponding to the tax.
     * 
     * @param _rawPrice
     *            the raw price
     * @param _taxRate
     *            the tax rate expressed as a value superior or equals to 1 (15% => 1.15)
     * @return the tax Amount.
     */
    public BigDecimal taxAmount(final double _rawPrice, final BigDecimal _taxRate) {
    
    
        return _taxRate.multiply(new BigDecimal(_rawPrice).min(BigDecimal.valueOf(1L)));
    }
    
    
    /**
     * Formats the tax into a String : 'tax%'
     * 
     * @param _taxToString
     *            the tax toString.
     * @return the tax toString.
     */
    public String taxToString(final double _taxToString) {
    
    
        return MessageFormat.format("{0}%", _taxToString);
        
    }
    
    
}
