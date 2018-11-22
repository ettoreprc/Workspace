from random import random
from threading import Thread 
import mainpackage

class Gatto (Thread) : 

    passo = 1
    posizione = random%mainpackage.Display.Display.getLunghezza()
        
    def muovi (self) : 
        mainpackage.Display.Display.getLock(self).acquire ()
        
        if self.posizione+self.passo >= mainpackage.Display.Display.getLunghezza() or  self.posizione+self.passo < 0 :
            mainpackage.Display.Display.getStringa(self) [self.posizione] = ' '
            self.passo*= -1 
            self.posizione+=self.passo
            mainpackage.Display.Display.getStringa(self) [self.posizione] = '*'
        mainpackage.Display.Display.getLock(self).release ()
        
        
    def getPosizione (self) :
        return self.posizione 