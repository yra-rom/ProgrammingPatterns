public class ListIterator<T> implements Iterator<T> {
    private SimpleLinkedList list;
    private ListNode currentNode;

    public ListIterator(SimpleLinkedList list) {
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

        ListNode<T> returnValue = currentNode;

        currentNode = currentNode.getNext();

        if(returnValue.getElement() == null){
            return null;
        } else {
            return returnValue.getElement();
        }
    }

    @Override
    public void remove() {
        list.remove((T)currentNode.getElement());
        currentNode = currentNode.getNext();
    }
}
