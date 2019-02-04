package nl.workingspirit.ski.threads.bakkerij.donotuse.solution;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class Voorraad implements Serializable{

    private AtomicInteger voorraad = new AtomicInteger(0);

    public int inc() throws InterruptedException {

        return this.voorraad.incrementAndGet();
    }

    public int dec() throws InterruptedException {

        return this.voorraad.decrementAndGet();
    }

    public int getVoorraad() {
        return this.voorraad.get();
    }
}
