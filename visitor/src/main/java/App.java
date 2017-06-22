import computer.part.Computer;
import visitors.ComputerPartDoVisitor;

public class App {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerPartDoVisitor visitor = new ComputerPartDoVisitor();
        visitor.visit(computer);
    }
}
