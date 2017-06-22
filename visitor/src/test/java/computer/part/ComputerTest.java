package computer.part;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import visitors.ComputerPartDisplayVisitor;
import visitors.ComputerPartDoVisitor;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class ComputerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void acceptDisplayVisitor() throws Exception {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

        assertTrue(outContent.toString().contains("Display Keyboard."));
        assertTrue(outContent.toString().contains("Display Mouse."));
        assertTrue(outContent.toString().contains("Display Monitor."));
        assertTrue(outContent.toString().contains("Display ComputerCase."));
        assertTrue(outContent.toString().contains("Display Computer."));
    }

    @Test
    public void acceptDoVisitor() throws Exception {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDoVisitor());

        assertTrue(outContent.toString().contains("Keyboard pressed."));
        assertTrue(outContent.toString().contains("Mouse clicked."));
        assertTrue(outContent.toString().contains("Monitor test image."));
        assertTrue(outContent.toString().contains("Computer case test."));
        assertTrue(outContent.toString().contains("Computer test."));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

}