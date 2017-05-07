package iterator;

public class ListIterator<T extends Comparable> implements Iterator<T> {
    private LinkedList list;
    private Node currentNode;

    ListIterator(LinkedList list) {
        this.list = list;
        this.currentNode = list.head;
    }

    @Override
    public boolean hasNext() {
        return currentNode != null && currentNode.getNext() != null;
    }

    @Override
    public T next() {
        if(currentNode == null || currentNode.getNext() == null){
            return null;
        }
        currentNode = currentNode.getNext();

        return (T) currentNode.getElement();
    }

    @Override
    public void remove() {
        list.remove((T)currentNode.getElement());
        currentNode = currentNode.getNext();
    }
}
