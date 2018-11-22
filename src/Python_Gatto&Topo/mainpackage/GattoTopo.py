from threading import RLock , Thread
import time 
from random import randint

class Striscia :
    lunghezza = 50 
    striscia = [None] * lunghezza 
    
    gatto = 0 
    topo = 0 
    
    sinistra = True 
    ciSonoModifiche = True
    lock = RLock ()
    fine = False 
    
    def __init__ (self):
        self.fine = False 
        while self.gatto == self.topo :  
            self.gatto = randint(0,self.lunghezza -1 )
            self.topo = randint(0,self.lunghezza -1 )

        
        for i in range (0 , self.lunghezza) :
            self.striscia [i] = '_'
        
        self.striscia [self.gatto] = 'G'
        self.striscia [self.topo] = 'T'
        
      #  print ("".join ("|") , end= "" , flush=True)
      #  print ("".join (self.striscia) , end= "" , flush=True)
      #  print ("".join ("|") , end= "" , flush=True)
        
    def display (self):
        self.lock.acquire()
        try : 
            if self.ciSonoModifiche : 
                print ("".join ("|") , end= "" , flush=True)
                print ("".join (self.striscia) , end= "" , flush=True)
                print ("".join ("|") , end= "" , flush=True)
                return not self.fine 
                
        finally :
            self.ciSonoModifiche = False 
            self.lock.release() 
    
    def muoviGatto (self) :
        
        self.lock.acquire () 
        try :
            if self.fine : 
                return True
            if self.getto == 0 : 
                self.sinistra = True 
            if self.gatto == self.lunghezza -1 :  
                self.sinistra = False 
            gattoTmp = self.gatto 
            
            if self.sinistra == True :
                self.getto += 1
            else :
                self.gatto -= 1
                
            self.striscia [self.gatto] = 'G'
            self.sinistra [gattoTmp] = '_'
            
            if (self.gatto == self.topo ) : 
                self.striscia[self.gatto ] = 'X'
                self.fine = True 
                return True 
            
            return False 
            
        finally:  
            self.ciSonoModifiche = True 
            self.lock.release()
            
    
    def muoviTopo (self) :
        self.lock.acquire () 
        
        try : 
            if self.fine :
                return True 
            topoTmp = self.topo 
            direzione = randint (0 , 10 ) 
            if self.topo == 0 : 
                self.topo += 1 
            elif self.topo == self.lunghezza - 1 : 
                self.topo -=1
            else : 
                if direzione % 2 == 0 : 
                    if self.topo == self.gatto -1 : 
                         self.topo += 2 
                    else : 
                        self.topo += 1
                else : 
                    if self.topo == self.gatto +1 : 
                         self.topo -= 2 
                    else : 
                        self.topo -= 1 
            self.striscia [topoTmp] = '_'
            self.striscia [self.topo] = 'T'
        
            if self.topo == self.gatto : 
                self.striscia [self.topo] = 'X'
                self.fine = True 
                return True 
        
        finally: 
            ciSonoModifiche = True 
            self.lock.release( ) 
    
class Display (Thread):
    def __init__ (self , striscia ) :  
        self.striscia = striscia 
        
    def run (self):
        while self.striscia.display(): 
            try : 
                time.sleep(0.1) 
            finally:
                pass 


class Gatto (Thread):
    
    def __init__ (self , striscia ) :  
        self.striscia = striscia 
        
    def run (self):
        while not self.striscia.muoviGatto() : 
            try : 
                time.sleep(0.1) 
            finally : 
                pass 
            


class Topo (Thread):
    def __init__ (self , striscia ) :  
        self.striscia = striscia 
        
    def run (self):
        while not self.striscia.muoviTopo() : 
            try : 
                time.sleep(0.1) 
            finally : 
                pass 

def main () : 
   striscia = Striscia () 
   gatto = Gatto () 
   topo = Topo () 
   display = Display (striscia)
   
##   display.run()
#   topo.run()
#   gatto.run()
