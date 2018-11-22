package com.mainpackage.dellabate.esempio;

public class WindowLookAndFeel implements LookAndFeel {
	 
    @Override
    public Button createButton() {
        return new WindowButton();
    }
 
    @Override
    public Combo createCombo() {
        return new WindowCombo();
    }
 
}