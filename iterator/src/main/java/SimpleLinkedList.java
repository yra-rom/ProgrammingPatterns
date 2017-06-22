public class SimpleLinkedList<T> implements SimpleList<T> {

    protected ListNode<T> head;
    private int size = 0;

    @Override
    public void add(T element) {
        ListNode<T> newNode = new ListNode<>(element);
        if (head == null) {
            head = newNode;
        } else {
            getLastNode().setNext(newNode);
        }
        ++size;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public boolean contains(T element) {
        ListNode<T> current = this.head;
        while (current != null) {
            if (current.getElement().equals(element)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public boolean empty() {
        return size == 0 && head == null;
    }

    @Override
    public void reverse() {
        ListNode<T> current = head;
        ListNode<T> previous = null;
        ListNode<T> next;

        while (current != null) {
            next = current.getNext();

            current.setNext(previous);

            previous = current;
            current = next;
        }
        head = previous;
    }

    @Override
    public void remove(T element) {
        ListNode<T> current = head;
        ListNode<T> previous = head;

        while (current != null) {
            if (current.getElement().equals(element)) {
                if (current == head) {
                    head = head.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                size -= 1;
            } else {
                previous = current;
            }
            current = current.getNext();
        }

    }

    @Override
    public int size() {
        return size;
    }

    private ListNode<T> getLastNode() {
        ListNode<T> current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(this);
    }
}