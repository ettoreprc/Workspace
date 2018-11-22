from threading import Thread
from time import sleep


class Pizzaiolo (Thread) : 

    def __init__ (self , bufferOrdini , bufferPizzePronte) : 
        self.bufferPizzePronte = bufferPizzePronte
        self.bufferOrdini = bufferOrdini 
        self.ordineInCorso = None
        
    def prelevaOrdine (self):
        self.ordineInCorso = self.bufferOrdini.get() 

    def eleboraOrdine (self) :
        sleep((self.ordineInCorso.getQuantita() * self.ordineInCorso.getCodicePizza()))
        
