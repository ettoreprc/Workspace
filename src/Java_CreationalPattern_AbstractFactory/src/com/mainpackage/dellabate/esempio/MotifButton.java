package com.mainpackage.dellabate.esempio;

public class MotifButton implements Button {
	 
    @Override
    public Button create() {
        System.out.println("Creazione MotifButton completata");
        return this;
    }
 
}