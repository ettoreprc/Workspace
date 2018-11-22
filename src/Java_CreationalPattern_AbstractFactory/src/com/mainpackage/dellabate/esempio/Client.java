package com.mainpackage.dellabate.esempio;

public class Client {
	 
    public static void main(String[] args) {
    	LookAndFeel lookAndFeel = null;
        if (args[0].equals("window"))
            lookAndFeel = new WindowLookAndFeel();
        else
            lookAndFeel = new MotifLookAndFeel();
        Button button = lookAndFeel.createButton();
        button.create();
        Combo combo = lookAndFeel.createCombo();
        combo.create();
    }
}