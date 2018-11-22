package com.mainpackage.dellabate.esempio;

public class WindowButton implements Button {
	 
    @Override
    public Button create() {
        System.out.println("Creazione WindowButton completata");
        return this;
    }
 
}