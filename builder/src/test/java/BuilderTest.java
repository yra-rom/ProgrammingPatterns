import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuilderTest {

    @Test
    public void testUserBuilder(){
        String name = "Johny";
        String surname =  "Westside";
        int age = 33;
        String email = "johny.westside@westside.com";
        String id = "777";
        String country = "USA";


        User user = new User.UserBuilder()
                .name(name)
                .surname(surname)
                .age(age)
                .email(email)
                .id(id)
                .country(country)
                .build();

        assertEquals(name, user.getName());
        assertEquals(surname, user.getSurname());
        assertEquals(age, user.getAge());
        assertEquals(email, user.getEmail());
        assertEquals(id, user.getId());
        assertEquals(country, user.getCountry());
    }
}
