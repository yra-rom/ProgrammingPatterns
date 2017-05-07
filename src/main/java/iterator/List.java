package iterator;

public interface List<T extends Comparable<T>>{
    void add(T element);
    void addFirst(T element);
    void addLast(T element);

    void clear();
    boolean contains(T element);

    T get(int index);
    T getFirst();
    T getLast();
    int indexOf(T element);

    T peek();
    T peekFirst();
    T peekLast();

    T poll();
    T pollFirst();
    T pollLast();

    void reverse();
    T remove();
    T remove(int index);
    void remove(T element);
    T removeFirst();
    void removeFirstOccurrence(T element);
    T removeLast();
    void removeLastOccurrence(T element);
    T set(int index, T element);
    int size();

}
