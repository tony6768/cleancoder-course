
package com.tocea.courses.module1.exercices;



public class Complex
{
    
    
    public static void main(final String[] args) {
    
    
        Complex.newComplexfromInteger(12);
    }
    
    
    public static Complex newComplexfromDouble(final double real, final double image) {
    
    
        return new Complex(real, image);
    }
    
    
    public static Complex newComplexfromInteger(final int _intValue) {
    
    
        return new Complex(_intValue);
    }
    
    
    
    private final double re;   // the real part
                             
    private final double im;   // the imaginary part
                             
    
    
    public Complex(final float _floatValue) {
    
    
        re = _floatValue;
        im = 0;
    }
    
    
    public Complex(final float _floatValue, final double _imaginaryPart) {
    
    
        re = _floatValue;
        im = _imaginaryPart;
    }
    
    
    public Complex(final int _intValue) {
    
    
        re = _intValue;
        im = 0;
    }
    
    
    public Complex(final short _shortValue) {
    
    
        re = _shortValue;
        im = 0;
        
    }
    
    
    // create a new object with the given real and imaginary parts
    private Complex(final double real, final double imag) {
    
    
        re = real;
        im = imag;
    }
}
