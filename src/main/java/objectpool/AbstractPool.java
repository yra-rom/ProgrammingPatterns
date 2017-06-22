package objectpool;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public abstract class AbstractPool<T> implements Pool<T> {
    private int countConnection = 0;

    @Getter
    @Setter
    private int maxConnection = 4;

    private ArrayList<T> locked;
    private ArrayList<T> unlocked;

    protected Creator<T> creator;

    public AbstractPool(Creator<T> creator) {
        this.creator = creator;
        initPools();
    }

    public AbstractPool(Creator<T> creator, int maxConnection) {
        this(creator);
        this.maxConnection = maxConnection;
    }

    protected abstract T create();

    private void initPools() {
        locked = new ArrayList<>();
        unlocked = new ArrayList<>();
    }

    @Override
    public synchronized void checkIn(T object) {
        if (object == null) {
            throw new NullPointerException();
        }

        locked.remove(object);
        unlocked.add(object);
        countConnection -=1;
    }

    @Override
    public synchronized T checkOut() {
        T returnValue = null;

        if (unlocked.size() > 0) {
            returnValue = unlocked.get(0);
            locked.add(returnValue);
            return returnValue;
        }

        if (countConnection < maxConnection) {
            returnValue = create();
            countConnection+=1;
            locked.add(returnValue);
            return returnValue;
        }

        return returnValue;
    }

}
