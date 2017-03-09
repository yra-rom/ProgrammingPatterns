package visitor.computerpart;

import visitor.visitors.ComputerPartVisitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
