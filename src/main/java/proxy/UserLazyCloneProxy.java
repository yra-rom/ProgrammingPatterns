package proxy;

import java.util.concurrent.atomic.AtomicInteger;

public class UserLazyCloneProxy implements Cloneable {
    private User underlyingUser;

    private AtomicInteger refCount;


    public UserLazyCloneProxy(User underlyingUser) {
        this.underlyingUser = underlyingUser.clone();
        this.refCount = new AtomicInteger(1);
    }

    @Override
    public Object clone(){
        UserLazyCloneProxy theClone;
        try {
            Cloneable original = underlyingUser;
            theClone = (UserLazyCloneProxy) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            theClone = null;
        }
        refCount.incrementAndGet();

        return theClone;
    }

    private void ensureUnderlyingUserNotShared(){
        if(refCount.get() > 1){
            underlyingUser = underlyingUser.clone();
            refCount.decrementAndGet();
            refCount = new AtomicInteger(1);
        }
    }

    public String getId(){
        return underlyingUser.getId();
    }

    public String getName(){
        return underlyingUser.getName();
    }

    public String getSurname(){
        return underlyingUser.getSurname();
    }

    public void setId(String id){
        ensureUnderlyingUserNotShared();
        underlyingUser.setId(id);
    }

    public void setName(String name){
        ensureUnderlyingUserNotShared();
        underlyingUser.setName(name);
    }

    public void setSurname(String surname){
        ensureUnderlyingUserNotShared();
        underlyingUser.setSurname(surname);
    }
}
