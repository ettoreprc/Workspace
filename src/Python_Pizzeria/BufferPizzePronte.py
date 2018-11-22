import Ordine


class BufferPizzePronte : 

    def __init__ (self) : 
        self.strutturaPizze = Ordine [10]
        
    def inserisciOrdine (self , ordine) :
        for i in range (0 , 9) :
            if self.ordiniPronti [i] == None : 
                self.ordiniPronti [i] = ordine 
                return 
