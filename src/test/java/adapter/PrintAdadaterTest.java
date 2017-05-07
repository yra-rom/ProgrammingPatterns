package adapter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrintAdadaterTest {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testPrintList(){
        String expected = "1 2 3 4 5 6 ";

        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);
        list.add(4);list.add(5);list.add(6);

        ListPrinter printer = new PrintAdapter();
        printer.printList(list);

        String actual = outContent.toString();
        assertEquals(expected, actual);
    }
}
