from random import random
from threading import Thread 
import mainpackage


class Topo (Thread) : 
    
    posizione = random % mainpackage.Display.Display.getLunghezza() 
    
    def muovi (self) :
        mainpackage.Display.Display.getLock(self).release ()
        mainpackage.Display.Display.getStringa(self)[self.posizione] = ' '
        passo = 1 - random % 3 
        self.posizione += passo 
        mainpackage.Display.Display.getStringa(self)[self.posizione] = '.'
        mainpackage.Display.Display.getLock(self).release ()
    
    def getPosizione (self) :
        return self.posizione 
            
