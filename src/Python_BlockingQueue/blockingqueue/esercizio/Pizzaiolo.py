from threading import Thread
from asyncio.tasks import sleep


class Pizzaiolo (Thread) : 

    def __init__(self):
        pass 
    
    def makePizza (self , gusto ) :
        
        if (self.gusto == "Marinara")  :
            sleep(0.5)
        if (self.gusto == "Margherita")  :
            sleep(1) 
        if (self.gusto == "4Formaggi")  :
            sleep(1.5) 
        if (self.gusto == "Capricciosa")  :
            sleep(2) 
                
    def pushPizza (self) :
        pass 
