from threading import Thread , Lock , RLock
class Stampa : 
    lock = Lock () 
    #reentrant lock ->RLock
    def stampa (self , c , l ):
            self.lock.acquire()
            for l in range (0 , l ) : 
                print(c , end= '', flush=True)
            print()
            self.lock.release () 
        
        
class StampaDollari(Thread):
    def __init__ (self , s ):
        super ().__init__()
        self.st = s 
    
    def run (self):
        while True  : 
            self.st.stampa ('$' , 20 )  
            
class StampaAsterischi (Thread):
    def __init__ (self , s ):
        super ().__init__()
        self.st = s 
    
    def run (self):
        while True  : 
            self.st.stampa ('*' , 20 )       
        
        
class StampaTrattini (Thread):
    def __init__ (self , s ):
        super ().__init__()
        self.st = s 
    
    def run (self):
        while True  : 
            self.st.stampa ('-' , 30)        
        
#main()            
s = Stampa ()

john = StampaAsterischi (s) 
al = StampaTrattini (s) 
jack = StampaDollari (s)
john.start()
al.start()
jack.start( )

for i in range (0 ,5 ):
    s.stampa('$' , 25 )