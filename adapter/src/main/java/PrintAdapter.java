import java.util.List;

public class PrintAdapter implements ListPrinter {
    @Override
    public void printList(List list) {
        StringBuilder builder = new StringBuilder();
        list.forEach(item -> builder.append(item).append(" "));

        Printer printer = new Printer();
        printer.print(builder.toString());
    }
}
