import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class UserLazyCloneProxyTest {
    private User user;

    @Before
    public void initUser(){
        user = new User("1", "Neil", "Gold");
    }

    @Test
    public void same() throws Exception{
        UserLazyCloneProxy userProxyOriginal = new UserLazyCloneProxy(user);
        UserLazyCloneProxy userProxyClone = (UserLazyCloneProxy) userProxyOriginal.clone();

        assertNotNull(userProxyClone);

        User userOriginal = getUnderlyingUser(userProxyOriginal);
        User userClone = getUnderlyingUser(userProxyClone);

        assertEquals(userOriginal, userClone);
        assertSame(userOriginal, userClone);
    }

    @Test
    public void sameOnRead() throws Exception {
        UserLazyCloneProxy userProxyOriginal = new UserLazyCloneProxy(user);
        UserLazyCloneProxy userProxyClone = (UserLazyCloneProxy) userProxyOriginal.clone();

        assertNotNull(userProxyClone);

        userProxyOriginal.getId();
        userProxyClone.getId();

        userProxyOriginal.getName();
        userProxyClone.getName();

        userProxyOriginal.getSurname();
        userProxyClone.getSurname();

        User userOriginal = getUnderlyingUser(userProxyOriginal);
        User userClone = getUnderlyingUser(userProxyClone);

        assertEquals(userOriginal, userClone);
        assertSame(userOriginal, userClone);
    }

    @Test
    public void notSameOnWrite()  throws Exception  {
        UserLazyCloneProxy userProxyOriginal = new UserLazyCloneProxy(user);
        UserLazyCloneProxy userProxyClone = (UserLazyCloneProxy) userProxyOriginal.clone();

        assertNotNull(userProxyClone);

        userProxyOriginal.setId("-1");
        userProxyClone.getId();

        User userOriginal = getUnderlyingUser(userProxyOriginal);
        User userClone = getUnderlyingUser(userProxyClone);

        assertNotEquals(userOriginal, userClone);
        assertNotSame(userOriginal, userClone);
    }

    @Test
    public void setId() throws Exception {
        UserLazyCloneProxy userProxyOriginal = new UserLazyCloneProxy(user);
        UserLazyCloneProxy userProxyClone = (UserLazyCloneProxy) userProxyOriginal.clone();

        assertNotNull(userProxyClone);

        userProxyOriginal.getId();
        userProxyClone.setId("1");

        User userOriginal = getUnderlyingUser(userProxyOriginal);
        User userClone = getUnderlyingUser(userProxyClone);

        assertEquals(userOriginal, userClone);
        assertNotSame(userOriginal, userClone);
    }

    @Test
    public void setName() throws Exception {
        UserLazyCloneProxy userProxyOriginal = new UserLazyCloneProxy(user);
        UserLazyCloneProxy userProxyClone = (UserLazyCloneProxy) userProxyOriginal.clone();

        assertNotNull(userProxyClone);

        userProxyOriginal.getId();
        userProxyClone.setName("NotNeil");

        User userOriginal = getUnderlyingUser(userProxyOriginal);
        User userClone = getUnderlyingUser(userProxyClone);

        assertNotEquals(userOriginal, userClone);
        assertNotSame(userOriginal, userClone);
    }

    @Test
    public void setSurname() throws Exception {
        UserLazyCloneProxy userProxyOriginal = new UserLazyCloneProxy(user);
        UserLazyCloneProxy userProxyClone = (UserLazyCloneProxy) userProxyOriginal.clone();

        assertNotNull(userProxyClone);

        userProxyOriginal.getId();
        userProxyClone.setSurname("NotGold");

        User userOriginal = getUnderlyingUser(userProxyOriginal);
        User userClone = getUnderlyingUser(userProxyClone);

        assertNotEquals(userOriginal, userClone);
        assertNotSame(userOriginal, userClone);
    }

    private User getUnderlyingUser(UserLazyCloneProxy userProxy) throws NoSuchFieldException, IllegalAccessException {
        Class userClass = userProxy.getClass();
        Field userField = userClass.getDeclaredField("underlyingUser");
        userField.setAccessible(true);
        User user = (User) userField.get(userProxy);

        return user;
    }

}