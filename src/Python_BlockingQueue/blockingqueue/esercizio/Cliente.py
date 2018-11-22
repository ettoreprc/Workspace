from threading import Thread


class Cliente (Thread): 

    def __init__ (self , _ordine) : 
        self.ordine = _ordine 
        
    def inserisciOrdine (self , _ordine) : 
        self.buffer.putOrdine(_ordine) 
        print ("Put Avvenuto")
