public class Circle extends AbstractFigure {
    @Override
    public void draw() {
        System.out.println("Drawing circle with transparency: " + getTransparency());
    }
}
