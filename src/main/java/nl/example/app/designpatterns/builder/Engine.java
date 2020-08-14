package nl.example.app.designpatterns.builder;

public class Engine {

    private int cc;

    public Engine(int cc) {
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cc=" + getCc() +
                '}';
    }
}
