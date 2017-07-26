
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandTest {
    private final static Integer NEW_TRANSPARENCY_LEVEL_ONE = 50;
    private final static Integer NEW_TRANSPARENCY_LEVEL_TWO = 2;
    private final static Integer NEW_TRANSPARENCY_LEVEL_THREE = 67;
    private static FigureProcessor processor;

    private Figure circle;
    private Command command;
    private Command command2;
    private Command command3;

    @BeforeClass
    public static void initProcessor() {
        processor = new FigureProcessor();
    }

    @Before
    public void initValues() {
        circle = new Circle();
        command = new ChangeTransparencyCommand(circle, NEW_TRANSPARENCY_LEVEL_ONE);
        command2 = new ChangeTransparencyCommand(circle, NEW_TRANSPARENCY_LEVEL_TWO);
        command3 = new ChangeTransparencyCommand(circle, NEW_TRANSPARENCY_LEVEL_THREE);
    }


    @Test
    public void executeOne() {
        processor.executeCommand(command);
        assertEquals(NEW_TRANSPARENCY_LEVEL_ONE, circle.getTransparency());
    }

    @Test
    public void undoOne() {
        processor.executeCommand(command);
        processor.undoLast();
        assertEquals((Integer) 0, circle.getTransparency());
    }

    @Test
    public void redoOne() {
        processor.executeCommand(command);
        processor.undoLast();
        processor.redoLast();
        assertEquals(NEW_TRANSPARENCY_LEVEL_ONE, circle.getTransparency());
    }

    @Test
    public void execute(){
        processor.executeCommand(command);
        assertEquals(NEW_TRANSPARENCY_LEVEL_ONE, circle.getTransparency());

        processor.executeCommand(command2);
        assertEquals(NEW_TRANSPARENCY_LEVEL_TWO, circle.getTransparency());

        processor.executeCommand(command3);
        assertEquals(NEW_TRANSPARENCY_LEVEL_THREE, circle.getTransparency());
    }

    @Test
    public void undo(){
        processor.executeCommand(command);
        processor.executeCommand(command2);
        processor.executeCommand(command3);

        processor.undoLast();
        assertEquals(NEW_TRANSPARENCY_LEVEL_TWO, circle.getTransparency());

        processor.undoLast();
        assertEquals(NEW_TRANSPARENCY_LEVEL_ONE, circle.getTransparency());
    }

    @Test
    public void redo(){
        processor.executeCommand(command);
        processor.executeCommand(command2);
        processor.executeCommand(command3);

        processor.undoLast();
        processor.undoLast();
        processor.undoLast();

        processor.redoLast();
        assertEquals(NEW_TRANSPARENCY_LEVEL_ONE, circle.getTransparency());

        processor.redoLast();
        assertEquals(NEW_TRANSPARENCY_LEVEL_TWO, circle.getTransparency());

        processor.redoLast();
        assertEquals(NEW_TRANSPARENCY_LEVEL_THREE, circle.getTransparency());
    }
}
