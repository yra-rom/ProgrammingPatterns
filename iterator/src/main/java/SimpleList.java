public interface SimpleList<T> extends Iterable<T> {
    void add(T element);
    void clear();
    boolean contains(T element);
    boolean empty();
    void reverse();
    void remove(T element);
    int size();

}
