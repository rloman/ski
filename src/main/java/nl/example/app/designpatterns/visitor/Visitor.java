package nl.example.app.designpatterns.visitor;

import nl.example.app.designpatterns.visitor.model.Apple;
import nl.example.app.designpatterns.visitor.model.Pear;

public interface Visitor {

    void visit(Apple p);
    void visit(Pear pear);
}