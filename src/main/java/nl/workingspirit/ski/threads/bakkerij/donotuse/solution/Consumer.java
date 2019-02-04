package nl.workingspirit.ski.threads.bakkerij.donotuse.solution;

public class Consumer implements Runnable {

    private Voorraad voorraad;

    public Consumer(Voorraad voorraad) {
        this.voorraad = voorraad;
    }

    @Override
    public void run() {

        try {
            this.voorraad.dec();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
