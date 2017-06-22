import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleLinkedListTest {

    private SimpleList list;

    @Before
    public void initList() {
        list = new SimpleLinkedList<Character>();
    }

    @After
    public void removeList() {
        list = null;
    }

    @Test
    public void add() throws Exception {
        list.add('a');
        list.add('b');

        assertTrue(list.contains('b'));
        assertTrue(list.contains('a'));
    }

    @Test
    public void clear() throws Exception {
        list.add('a');
        list.add('b');
        list.add('c');

        list.clear();
        assertEquals(0, list.size());
        assertTrue(list.empty());
    }

    @Test
    public void contains() throws Exception {
        list.add('1');
        assertTrue(list.contains('1'));
        assertFalse(list.contains('z'));
    }

    @Test
    public void reverse() throws Exception {
        list.add('x');
        list.add('y');
        list.add('z');

        list.reverse();

        assertEquals(3, list.size());
        assertTrue(list.contains('x'));
        assertTrue(list.contains('y'));
        assertTrue(list.contains('z'));
    }

    @Test
    public void remove() throws Exception {
        list.add('*');
        list.remove('*');
        assertEquals(0, list.size());
        assertFalse(list.contains('*'));

        list.remove('d');
        assertEquals(0, list.size());
        assertFalse(list.contains('d'));


        list.add('x');
        list.remove('y');
        assertEquals(1, list.size());
        assertTrue(list.contains('x'));
    }

    @Test
    public void size() throws Exception {
        list.add('1');
        list.add('i');
        list.add('s');

        assertEquals(3, list.size());
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void iterator() throws Exception {
        Character[] array = {'a','b','c','d','e','f'};

        for(char c : array){
            list.add(c);
        }

        Iterator<Character> iterator = list.iterator();

        int i = 0;
        while(iterator.hasNext()){
            Character t = iterator.next();
            assertEquals(array[i++], t);
        }

        assertNull(iterator.next());
        assertFalse(iterator.hasNext());

        Iterator<Character> iterator1 = list.iterator();
        assertTrue(iterator1.hasNext());

    }

}