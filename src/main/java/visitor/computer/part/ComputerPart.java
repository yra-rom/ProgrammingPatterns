package visitor.computer.part;

import visitor.visitors.ComputerPartVisitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
