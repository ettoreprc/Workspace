package teoria.dellabate;

public class Addizione implements Espressione {
	 
    @Override
    public int interpreta(Contesto contesto) {
        return contesto.pop().interpreta(contesto) + contesto.pop().interpreta(contesto);
    }
 
}