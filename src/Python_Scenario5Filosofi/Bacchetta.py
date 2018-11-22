from asyncio.locks import Lock, Condition
from threading import Thread
from asyncio.tasks import sleep
from random import randrange

class bacchette  : 

    def __init__ (self) : 
        #self.lock = Lock ()   
        self.occupata = False 
    def prndibacchette (self) : 
        #self.lock.acquire()
        self.occupata = True
        print("prendi bacchette")

    def lasciabacchette (self): 
        #self.lock.release ()
        self.occupata = False  
        print("lascio bacchette")

class tavolo : 

    def __init__ (self): 
        self.bacchette = [bacchette () for _ in range (5)]
        self.lock = locals() 
        self.condition = Condition() 
    
    
    def mollaLockSimultaneo (self , posizione ):
        self.bacchette [posizione].occupata = False 
        self.bacchette [(posizione + 1)%5 ].occupata = False 
        self.condition.notifyAll()
        self.lock.release()  
        
        
    def prendiLockSimultaneo (self , posizione ):
        self.lock.acquire()
            while self.bacchette[posizione].occupata and
                self.bacchette[(posizione+1)%5].occupata :
                    
                    self.condition.wait()
             
             self.bacchette [posizione].occupata = True
             self.bacchette [(posizione + 1)%5 ].occupata = True
            
        self.lock.release()
        
class filosofo (Thread): 

    def __init__ (self, tavolo , pos) : 
        super().__init__() 
        self.posizione = pos 
        self.t = tavolo 
        self.nome = "Filosofo %s" % pos 
        
    def attesaCasuale (self , msec ):
        sleep (randrange(msec)/1000.0)
    
    def pensa (self) :
        print ("il filosofo %s pensa " % self.getName())
        self.attesaCasuale(2000)   
        print ("il filosofo %s vuole mangiare " % self.getName())

    def mangia (self ):
        print("il filosofo %s vuole mangiare" % self.getName())
        #self.t.bacchette [self.posizione].prendibacchette () 
        self.prendiLockSimultaneo(self , posizione )
        print("il filosofo %s prende prima bacchette" % self.getName())
        #self.t.bacchette [(self.posizione+1)%5].prendibacchette () 
        print("il filosofo %s prende seconda bacchette" % self.getName())
        print("il filosofo %s mangia " % self.getName())
        self.attesaCasuale(1000)
        print("il filosofo %s finisce di mangiare " % self.getName())
        #self.t.bacchette [self.posizione].lasciabacchette () 
        print("il filosofo %s lascia prima bacchette" % self.getName())
        #self.t.bacchette [(self.posizione+1)%5].lasciabacchette () 
        print("il filosofo %s lascia seconda bacchette" % self.getName())
        self.mollaLockSimultaneo(self.posizione)
            
    def run (self): 
        while True : 
            self.pensa ()
            self.mangia () 


if __name__ == '__main__':
    tavolo = tavolo ()
    filosofo = [filosofo(tavolo , i ) for i in range (5)]
    for d in filosofo : 
        d.start()