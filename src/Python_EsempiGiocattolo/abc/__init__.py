class ClassA  :
    def __init__ (self , _stringa) :
        self.stringa = _stringa  
        
    def getStringa (self) : 
        return self.stringa 
        
a = ClassA ("ciao")         
print(a.getStringa)