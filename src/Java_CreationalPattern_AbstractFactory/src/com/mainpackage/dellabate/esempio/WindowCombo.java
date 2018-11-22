package com.mainpackage.dellabate.esempio;

public class WindowCombo implements Combo {
	 
    @Override
    public Combo create() {
        System.out.println("Creazione WindowCombo completata");
        return this;
    }
 
}