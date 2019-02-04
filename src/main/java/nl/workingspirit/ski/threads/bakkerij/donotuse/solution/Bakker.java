package nl.workingspirit.ski.threads.bakkerij.donotuse.solution;

import java.io.Serializable;

public class Bakker implements Runnable, Serializable {

    private Voorraad voorraad = new Voorraad();

    public Bakker(Voorraad voorraad) {
        this.voorraad = voorraad;
    }


    @Override
    public void run() {
        try {
            this.voorraad.inc();
            this.voorraad.inc();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}