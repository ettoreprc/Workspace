from esercizioStudente.Studente import Studente
from esercizioStudente.Persona import Persona
from esercizioStudente.Esame import Esame

def main () : 
    
    esame1 = Esame ("Analisi" , "001" , 19) 
    esame2 = Esame ("Fondamenti" , "001" , 24)
    esame3 = Esame ("Architettura degli elaboratori " , "001" , 19)
    esame4 = Esame ("Programmazione ad Oggetti" , "001" , 18)
    esame5 = Esame ("IGPE" , "001" , 24)
    esame6 = Esame ("Matematica Discreta" , "001" , 18)
    esame7 = Esame ("Linguaggi Formali " , "001" , 24 )
    
    listaEsami = [esame1 , esame2, esame3 ,esame4 ,esame5 ,esame6 ,esame7 ]
    persona1 = Persona ("Ettore" , "Cammarata" , "CMMTTR93C05G082R")
    studente1 = Studente (persona1 , "156330001" , listaEsami )
    
    print("Media " + str (studente1.calcolaMedia()))
    print (studente1.controllaEsame ("002") )

if __name__ == '__main__':
    main()