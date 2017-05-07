package adapter;

import java.util.List;

public class PrintAdapter implements ListPrinter {
    @Override
    public void printList(List list) {
        Printer printer = new Printer();
        list.forEach((item)->printer.print(item.toString()));
    }
}
