public interface Pool<T> {
    void checkIn(T object);
    T checkOut();
}
