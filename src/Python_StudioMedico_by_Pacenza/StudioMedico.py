from threading import Thread , RLock , Condition 
from random import randint 
from queue import Queue 
import time 

class Ricetta : 
    nomeMedicina = ""
    def __init__ (self , nomeMedicina): 
        self.nomeMedicina = nomeMedicina 
        
    def ricettaPrnota (self) :
        pass 

class SalaDiAttesa : 
    attesaVisitaa = Queue (10)
    attesaRicetta = Queue (10) 
    attesaRicettaPrioritaria = Queue (10) 
    
    def __init__ (self , av , ar ,arp ):
        pass  
    
    def putPaziente (self , paziente , tipoFila ) :
        #1 - controllo tipo fila 
        #2 - effettuo la put nella queue corretta 
        pass 
    
    def getPaziente (self , tipoFila ):
                #1 - controllo tipo fila 
        #2 - effettuo la get nella queue corretta 
        
        if tipoFila == 2 : 
            #controllare se entrambe le queue sono vuote 
            #se sono entrambe vuote -> segretaria in attesa 
            #se c'è un paziente nella fila prioritaria -> preleva da fila pioritaria 
            #preleva paziente standard 
            pass 

        pass 
    
    
class Medico (Thread):
    
    def __init__ (self , nome , saladiattesa): 
        pass  
    def run (self) : 
    # 1 - preleva paziente 
    # 2 - random sleep 
    # 3 - random choice 
    # 3.1 decide se il paziente deve adare via o se deve mettersi nella fila prioritaria e manda via il paziente 
    # 5 - ritorna al punto 1 
        pass 
    pass 

class Segretaria (Thread):
    def __init__ (self , nome , saladiattesa): 
        pass  
    
    def run (self) :
    # 1 preleva un paziente 
    # 2 prepara ricetta 
    # 3 rimuove il paziente dalla lista 
    # 4 ritorna al punto 1 
        pass 
    def attendiRicetta (self) : 
        pass 
    pass

class Paziente(Thread):
    def __init__ (self , nome , saladiattesa): 
        pass 
    
    #1 entra nello stuio medico 
    #si mette in fila 
    # aspetta un numero random di secondi 
    # si puo mettere tutto all'interno di un while true  
     
    pass