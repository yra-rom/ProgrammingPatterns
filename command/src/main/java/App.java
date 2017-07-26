public class App {
    public static void main(String[] args) {
        Figure circle = new Circle();
        FigureProcessor processor = new FigureProcessor();
        Command command = new ChangeTransparencyCommand(circle, 50);

        System.out.println("Before executing:");
        circle.draw();

        processor.executeCommand(command);
        System.out.println("After executing:");
        circle.draw();

        processor.undoLast();

        System.out.println("After undo:");
        circle.draw();

        processor.redoLast();
        System.out.println("After redo:");
        circle.draw();
    }
}
