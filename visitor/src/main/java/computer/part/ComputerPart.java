package computer.part;


import visitors.ComputerPartVisitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
