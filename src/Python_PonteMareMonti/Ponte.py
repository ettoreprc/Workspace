from threading import Thread
import time

class Ponte : 
    
    def __init__(self):
        self.timer = Timer (self.ponteOccupato)
        self.dimensionePonte = 20 
        self.ponteOccupato = False 

    
class Turista (Thread): 
    
    def __init (self , _direzione):
        self.direzione = _direzione
    
    def run (self): 
        pass 

class Timer (Thread): 
    
    def __init__ (self , occupato ):
        self.secondi = 10
        
        
    def run (self):    
        
        while (self.secondi > 0 ) : 
            self.secondi -= 1 
            time.sleep (1)
            print(self.secondi)
            
        self.secondi = 10 
        occupato = False 
        
            
        
if __name__ == '__main__':
    timer = Timer (False) 
    timer.run()