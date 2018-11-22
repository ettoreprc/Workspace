from test.test_httplib import CERT_selfsigned_pythontestdotnet
from _thread import RLock
from _ast import Try
from asyncio.locks import Condition


class BlockingQueue : 
    
    def __init__(self, N): 
        self.in_index = 0  
        self.out_index = 0 
        self.N = N 
        self.elementiPieni = 0 
        self.theBuffer = [None] * self.N 
        self.lock = RLock ()    
        self.condition = Condition (self.lock)
    
    def put (self, elem):
        self.lock.acquire() 
        try : 
            while (self.elementiPieni >= self.N) :
                self.condition.wait()
            self.elementiPieni += 1 
            self.theBuffer [self.in_index] = elem 
            self.in_index = (self.in_index + 1) % self.N         
            self.condition.notify_all()
            return True 
        finally:
            self.lock.release ()  
    
    def get (self):
        self.lock.acquire() 
        try : 
            while (self.elementiPieni <= 0) :
                self.condition.wait()
            self.elementiPieni -= 1 
            oldOut = self.out_index 
            self.out_index = (self.out_index + 1) % self.N 
            self.condition.notify_all()
            return self.theBuffer [oldOut]
        finally:  
            self.lock.release () 
