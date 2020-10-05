package nl.example.app.designpatterns.visitor.model;

import nl.example.app.designpatterns.visitor.Visitor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Fruitmand extends Fruit implements Iterable<Fruit> {

    private Set<Fruit> fruit = new HashSet<>();

    @Override
    public void accept(Visitor visitor) {
        for(Fruit f: fruit) {
            f.accept(visitor);
        }
    }

    public boolean add(Fruit fruit) {
        return this.fruit.add(fruit);
    }

    @Override
    public Iterator<Fruit> iterator() {
       return this.fruit.iterator();
    }
}