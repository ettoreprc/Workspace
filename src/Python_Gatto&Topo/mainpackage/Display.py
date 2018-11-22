from threading import Thread , Lock 


class Display : 
    
    lunghezza = 10 
    stringa = [lunghezza]
    lock = Lock ()
  
    def getLunghezza (self) :
        return self.lunghezza
    
    def stampa (self) :
        self.lock.acquire()
        for i in range (0 , self.lunghezza) : 
            print(self.stringa [i])
        self.lock.release () 
    
    def getLock (self) :
        return self.lock   
    
    def getStringa (self) : 
        return self.stringa 
