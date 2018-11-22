package mainpackage.composite;

import java.util.ArrayList;
import java.util.List;

class CompositeGraphic implements Graphic {

    //Collezione di grafici figli.
    private List<Graphic> mChildGraphics = new ArrayList<Graphic>();

    //Stampa il grafico.
    public void print() {
        for (Graphic graphic : mChildGraphics) {
            graphic.print();
        }
    }

    //Aggiunge il grafico alla composizione.
    public void add(Graphic graphic) {
        mChildGraphics.add(graphic);
    }

    //Rimuove il grafico dalla composizione.
    public void remove(Graphic graphic) {
        mChildGraphics.remove(graphic);
    }

}