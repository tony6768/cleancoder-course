
package com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice2;



import java.math.BigDecimal;



/**
 * Objectif du TP :
 * Demander aux étudiants de modifier la classe TaxComputation pour gérer la saisie de taxes écrites sous la forme d'un int compris entre 0
 * et 100. (Au départ ca n'accepte que des valeurs entre 1 et +).
 * Demander aux étudiants de pouvoir faire la meme chose en double.
 * Demander une fonction qui formate un taux de taxe sous la forme d'une String de type MessageFormat.format("{0}%");
 * 
 * @author sleroy
 */
public class Tax
{
    
    
    /**
     * Returns the tax. Value must be comprised between 1 and 2.
     * 
     * @param _tax
     *            the tax
     * @return the tax
     */
    public static Tax newTaxFromDouble(final double _tax) {
    
    
        return new Tax(_tax);
    }
    
    
    public static Tax newTaxFromInteger(final int _tax) {
    
    
        return new Tax(_tax);
    }
    
    
    public static Tax newTaxInPercentage(final int _tax) {
    
    
        final double normalizedTax =
                new BigDecimal(_tax).divide(new BigDecimal(100.0d)).doubleValue();
        return new Tax(normalizedTax);
    }
    
    
    
    private final BigDecimal tax;
    
    
    
    public Tax(final double _tax) {
    
    
        super();
        tax = new BigDecimal(_tax);
    }
}
