package myimplementation;

interface Visitor {
	
	// Created to automatically use the right 
	// code based on the Object sent
	// Method Overloading
	
	public String visit(Liquor liquorItem);
	
	public String visit(Tobacco tobaccoItem);
	
	public String visit(Necessity necessityItem);
	
}
