package computer.part;


import visitors.ComputerPartVisitor;

public class Computer implements ComputerPart {
    private ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor(), new ComputerCase()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for(ComputerPart part : parts){
            part.accept(visitor);
        }
        visitor.visit(this);
    }

}
