public class App {
    public static void main(String[] args) {
        SimpleList<Character> list = new SimpleLinkedList<>();
        addValues(list);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            Character character = (Character) iterator.next();
            System.out.print(character);
        }
    }

    private static void addValues(SimpleList list) {
        list.add('h'); list.add('e'); list.add('l'); list.add('l'); list.add('o');
        list.add(' ');
        list.add('w'); list.add('o'); list.add('r'); list.add('l'); list.add('d');
    }
}
