package objectpool;

public interface Creator<T> {
    T create();
}
