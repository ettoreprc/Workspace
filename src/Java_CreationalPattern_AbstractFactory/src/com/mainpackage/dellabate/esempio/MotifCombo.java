package com.mainpackage.dellabate.esempio;

public class MotifCombo implements Combo {
	 
    @Override
    public Combo create() {
        System.out.println("Creazione MotifCombo completata");
        return this;
    }
 
}