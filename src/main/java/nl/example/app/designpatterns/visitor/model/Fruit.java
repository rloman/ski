package nl.example.app.designpatterns.visitor.model;

import nl.example.app.designpatterns.visitor.Visitor;

public abstract class Fruit {

    public abstract void accept(Visitor visitor);
}
