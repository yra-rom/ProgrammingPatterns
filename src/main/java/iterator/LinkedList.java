package iterator;

public class LinkedList<T extends Comparable<T>> implements List<T>, Iterable<T> {

    protected Node<T> head;
    private int size = 0;

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if(head == null){
            head = newNode;
        }else{
            getLastNode().setNext(newNode);
        }
        ++size;
    }

    @Override
    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        if(head == null){
            this.head = newNode;
        }else{
            newNode.setNext(head);
            head = newNode;
        }
        ++size;
    }

    @Override
    public void addLast(T element) {
        add(element);
    }

    @Override
    public void clear() {
        head=null;
        size = -1;
    }

    @Override
    public boolean contains(T element) {
        Node<T> current = this.head;
        while(current != null){
            if(current.getElement().compareTo(element) == 0){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public T get(int index) {
        if(index >= size){
            return null;
        }else{
            Node<T> current = head;
            for(int i=0; i<size; ++i){
                if(i == index){
                    return current.getElement();
                }
                current = current.getNext();
            }

            return null;
        }
    }

    @Override
    public T getFirst() {
        return head.getElement();
    }

    @Override
    public T getLast() {
        return getLastNode().getElement();
    }

    @Override
    public int indexOf(T element) {
        if(size < 1){
            return -1;
        }else{
            Node<T> current = head;
            for(int i=0; i<size; ++i){
                if(current.getElement().compareTo(element) == 0){
                    return i;
                }
                current = current.getNext();
            }

            return -1;
        }
    }

    @Override
    public T peek() {
        if(head == null){
            return null;
        }else{
            return head.getElement();
        }
    }

    @Override
    public T peekFirst() {
        return peek();
    }

    @Override
    public T peekLast() {
        return getLast();
    }

    @Override
    public T poll() {
        --size;
        if(head == null){
           return null;
        }else {
            Node<T> node = head;
            head = head.getNext();
            return node.getElement();
        }
    }

    @Override
    public T pollFirst() {
        return poll();
    }

    @Override
    public T pollLast() {
        --size;
        if(head == null){
            return null;
        }else{
            Node<T> current = head;
            Node<T> previous = null;
            while(current.getNext() != null){
                previous = current;
                current = current.getNext();
            }
            previous.setNext(null);
            return current.getElement();
        }
    }

    @Override
    public void reverse() {
        Node<T> current = head;
        Node<T> previous = null;
        Node<T> next = null;

        while(current != null){
            next = current.getNext();

            current.setNext(previous);

            previous = current;
            current = next;
        }
        head = previous;
    }

    @Override
    public T remove() {
        return poll();
    }

    @Override
    public T remove(int index) {
        Node<T> current = head;
        Node<T> previous = null;
        if(index == 0){
            return poll();
        }

        for(int i=0; i<size; ++i){
            if(i == index){
                previous.setNext(current.getNext());
                --size;
                return current.getElement();
            }
            previous = current;
            current = current.getNext();
        }
        return null;
    }

    @Override
    public void remove(T element) {
        Node<T> current = head;
        Node<T> previous = head;

        while(current != null){
            if(current.getElement().compareTo(element) == 0){
                if(current == head){
                    head = head.getNext();
                }else {
                    previous.setNext(current.getNext());
                }
            }else{
                previous = current;
            }
            current = current.getNext();
        }
    }

    @Override
    public T removeFirst() {
        Node<T> current = head;
        head = head.getNext();
        return current.getElement();
    }

    @Override
    public void removeFirstOccurrence(T element) {
        Node<T> current = head;
        Node<T> previous = head;

        while(current != null){
            if(current.getElement().compareTo(element) == 0){
                if(current == head){
                    head = head.getNext();
                }else {
                    previous.setNext(current.getNext());
                }
                return;
            }else{
                previous = current;
            }
            current = current.getNext();
        }
    }

    @Override
    public T removeLast() {
        if(head == null){
            return null;
        }
        Node<T> current = head;
        Node<T> previous = head;
        while(current.getNext() != null){
            previous = current;
            current = current.getNext();
        }
        previous.setNext(null);
        if(current == head){
            head = null;
        }
        return current.getElement();
    }

    @Override
    public void removeLastOccurrence(T element) {
        Node<T> current = head;
        Node<T> previous = head;
        Node<T> toDelete = null;
        Node<T> toDeletePrevious = null;

        while(current != null){
            if(current.getElement().compareTo(element) == 0){
                toDelete = current;
                toDeletePrevious = previous;
            }
            previous = current;
            current = current.getNext();
        }

        if(toDelete != null && toDeletePrevious != null){
            toDeletePrevious.setNext(toDelete.getNext());
        }
    }

    @Override
    public T set(int index, T element) {
        if(index>=size){
            return null;
        }

        Node<T> current = head;

        for(int i=0; i<size; ++i, current = current.getNext()){
            if(i==index){
                T returnElement = current.getElement();
                current.setElement(element);
                return returnElement;
            }
        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    public void showList(){
        Node<T> current = this.head;
        while(current != null){
            System.out.print(current.getElement() + "->");
            current = current.getNext();
        }
        System.out.println();
    }

    private Node<T> getLastNode(){
        Node<T> current = this.head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        return current;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>(this);
    }
}