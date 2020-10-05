package nl.example.app.designpatterns.visitor.model;

import nl.example.app.designpatterns.visitor.Visitor;

public class Apple extends Fruit {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}