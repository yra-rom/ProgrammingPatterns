package visitor.visitors;

import visitor.computer.Computer;
import visitor.computer.part.*;

public class ComputerPartDoVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard pressed.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse clicked.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitor test image.");
    }

    @Override
    public void visit(ComputerCase computerCase) {
        System.out.println("Computer case test.");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Computer test.");
    }
}
