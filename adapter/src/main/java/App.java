import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ListPrinter printer = new PrintAdapter();
        ArrayList<Character> list = new ArrayList<>();

        list.add('h');list.add('e');list.add('l');list.add('l');list.add('o');
        list.add(' ');
        list.add('w');list.add('o');list.add('r');list.add('l');list.add('d');

        printer.printList(list);
    }
}
