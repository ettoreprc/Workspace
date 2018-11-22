from threading import RLock , Thread , Condition 
from random import randint 
from enum import Enum 
from queue import Queue
import time 
from asyncio.tasks import sleep


class TipoPizza (Enum):
    Margherita = 1 
    QuattroStagioni = 2 
    Paperino = 3 

    
class Ordine : 
    nextIdOrdine = 0 

    def __init__ (self , tipoPizza , quantita):
        self.tipoPizza = tipoPizza
        self.quantita = quantita 
        self.pizze = ""
        self.idOrdine = Ordine.nextIdOrdine
        Ordine.nextIdOrdine +=1
        
    def prepara (self) : 
        for i in range (0 , self.quantita) : 
            self.pizze += ("(*) ")
        
        
        
class BlockingSet (set) :
    maxSize = 10 ; 
    lock = RLock()
    conditionFull = Condition(lock)
    conditionEmpty = Condition(lock)
    
    def __init__ (self , size):
        self.maxSize = size 
        
    def add (self , T):
        self.lock.acquire()
        
        try : 
            while len (self) == self.maxSize  : 
                self.conditionFull.wait()
            return super().add(T) 
        finally:
            self.conditionEmpty.notifyAll()
            self.lock.release()
    
    def remove (self , T):
        self.lock.acquire()
        
        try : 
            retValue = T in self
            while (not retValue) : 
                self.conditionEmpty.wait()
                retValue = T in self
            
            super.remove(T)
            return retValue 
        finally:
            self.lock.release()
            self.conditionFull.notifyAll()

class Pizzeria : 
    
    bo = Queue (10)
    bp = BlockingSet (10) 
    
    def __init__ (self , sizebo , sizebp):
        self.bo = Queue (sizebo ) 
        self.bp = BlockingSet (sizebp)
        
    def putOrdine (self , tipoPizza , quantita) :
        ordine = Ordine (tipoPizza , quantita)
        try : 
            self.bo.put(ordine) 
        finally:
            pass 
        return ordine 
        
    def getOrdine (self) : 
        try : 
            return self.bo.get () 
        finally:
            pass 
        return None
    
    def putPizze (self , ordine) : 
        self.bp.add(ordine) 
    
    def getPizze (self , ordine) :
        self.bp.remove(ordine) 


class Cliente (Thread): 
    def __init__ (self , name , pizzeria):
        Thread.__init__ (self) 
        super().setName (name) 
        self.pizzeria = pizzeria 
        
        
    def run (self) :
        while True : 
            try :
                print("il cliente " +super().getName () +"entra nella pizzeria ")
                quantita = randint (1,7) 
                tipoPizza = TipoPizza (randint (1,3 ))
                ordine = self.pizzeria.putOrdine (tipoPizza , quantita)
               # print("il cliente " + super().getName () +" e in attesa dell ordine  con id " + ordine.idOrdine )
                time.sleep(randint (1 , 4 ) * quantita ) 
    
                self.pizzeria.getPizze(ordine )
                
         #       print("il cliente " + super().getName() + "ha prelevato le pizze ")
                
                time.sleep(randint(1,10))
            finally: 
                pass

class Pizzaiolo (Thread ) : 
    def __init__ (self , nome , pizzeria):
        Thread.__init__ (self) 
        super().setName (nome) 
        self.pizzeria = pizzeria 
        
    def run (self) :
        
        while True : 
            print ("il pizzaiolo " + self.getName ()  )
            ordine = self.pizzeria.getOrdine()
            tempoDiPreparazione = ordine.quantita 
       #     print ("il pizzaiolo " + self.getName () +"ha prelavato l ordine con " + self.ordine.idOrdine )
            time.sleep(tempoDiPreparazione * 1 )
            ordine.prepara()
            
            self.pizzeria.putPizze(ordine)
        #    print ("il pizzaiolo " + self.getName () +"ha completato l ordine " + self.ordine.idOrdine )
            
            time.sleep(randint(1,3))


def main (): 
    pizzeria = Pizzeria (10 , 10 )
    pizzaiolo = [Pizzaiolo] * 3 
    cliente = [Cliente] *10 
    for i in range (0 , 3 ) : 
        pizzaiolo [i] = Pizzaiolo ("Gino" + str(i) , pizzeria )
        pizzaiolo [i].start() 
    for i in range (0 , 10 ) : 
        cliente [i] = Cliente("Meko " + str(i) , pizzeria )
        cliente  [i].start() 

if __name__ == '__main__'  : 
    main () 