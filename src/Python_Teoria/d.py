import time
from test.libregrtest.save_env import multiprocessing
from threading import Thread 
from _thread import RLock
from asyncio.locks import Condition


#iMPLEMENTAZIONE DI BARRIERA


class Barrier  : 
        def __init__ (self , n ): 
            self.soglia = n 
            self.threadArrivati = 0 
            self.lock = RLock () 
            self.condition = Condition(self.lock) 
            
        def wait (self) :
            self.lock.acquire()
            self.threadArrivati += 1 
            
            if self.threadArrivati == self.soglia : 
                self.condition.notify_all( )
            
            while self.threadArrivati < self.soglia : 
                self.condition.wait()
            self.lock.release()
            
class Ciuccio (Thread ):
    
    def __init__(self , min , max  , b) :
        super().__init__
        self.min = min 
        self.max = max 
        self.totale = 0 
        self.b = b 
        
    def getTotale (self) :
        return self.totale 
    
    def run (self): 
        self.totale = contaPrimi (self.min , self.max )
        
    
    def contaPrimiMultiThread ( self , min , max ):
    
        self.min = min 
        self.max = max 
        if max < min :
            return 0 
    
        threadReali = multiprocessing.cpu_count() 
        print("core disponibili ()" .format(threadReali))
        
        ciucci = [] 
        
        fetta = (max - min + 1 ) // threadReali 

        while (fetta == 0 ) :
            threadReali -=1 
            fetta = (max - min + 1 ) // threadReali 
    
            b = Barrier ()
        
        for i in range (threadReali) : 
            minI = min + i*fetta 
            maxI = min + fetta-1 
            ciucci.append(Ciuccio (minI , maxI , b )) 
            ciucci[i].start ()  
            
        ciucci.append(Ciuccio( min + (threadReali -1 * fetta , max , b )))
        ciucci[threadReali -1 ].start () 
            
        b.wait()
            
            
        totale = 0 
        for i in range (threadReali) : 
            totale += ciucci [i].getTotale () 
        return totale 

def eprimo (n) : 
    for i in range (2 , n ) : 
        if n % i == 0  : 
            return False
    return True

def contaPrimi (self , min , max ) :
    
    self.min = min 
    self.max = max 
     
    contatore = 0
        for i in range (min , max +1) : 
            if eprimo (i) : 
                contatore += 1  
    return contatore  
    
    
if __name__ == '__main__' : 
    start = time.time()
    
    min = 10000 
    max = 100000
    c = Ciuccio () 
    c.contaPrimiMultiThread (min , max )
    #print ("primi tra %d e & %d : %d " %(min , max , contaPrimiMultiThread (min , max )))
    tempoPassato = time.time() - start 
    print ("Tempo passato : %d " % tempoPassato) 
    