package nl.example.app.designpatterns.visitor;

import nl.example.app.designpatterns.visitor.model.Apple;
import nl.example.app.designpatterns.visitor.model.Fruitmand;
import nl.example.app.designpatterns.visitor.model.Pear;

public class App {

    public static void main(String[] args) {
        Fruitmand mand = new Fruitmand();
        mand.add(new Apple());
        mand.add(new Pear());
        mand.add(new Apple());

        Visitor visitor = new FruitCounterVisitor();
        mand.accept(visitor);

        System.out.println(visitor);
    }
}