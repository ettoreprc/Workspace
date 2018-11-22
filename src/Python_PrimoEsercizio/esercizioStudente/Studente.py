from esercizioStudente.Persona import Persona 
class Studente () : 
    def __init__ (self , persona , matricola = "0" , listaEsami = [] ) : 
        self.persona = Persona ("" , "" , "" , "" )
        self.persona = persona 
        self.matricola = matricola
        self.listaEsami = listaEsami 
        
    def calcolaMedia (self)  :
        sommatoria = 0
        i = 0 
        for i in range (len(self.listaEsami)): 
            sommatoria+=self.listaEsami[i].votoP
        return sommatoria/ len(self.listaEsami)
    
    def controllaEsame (self , esame) : 
        b = False  
        for i in range (len(self.listaEsami)) :
            if self.listaEsami [i].codiceInsegnamento == esame :
                b =True 
        return b ; 