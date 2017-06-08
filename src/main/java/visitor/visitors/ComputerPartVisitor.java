package visitor.visitors;

import visitor.computer.Computer;
import visitor.computer.part.*;

public interface ComputerPartVisitor {
    void visit(Keyboard keyboard);
    void visit(Mouse mouse);
    void visit(Monitor monitor);
    void visit(ComputerCase computerCase);
    void visit(Computer computer);
}
