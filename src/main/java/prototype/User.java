package prototype;


import lombok.EqualsAndHashCode;
import lombok.Setter;

@Setter
@EqualsAndHashCode
public class User implements Copyable {
    private String id;
    private String name;
    private String surname;
    private int age;
    private String email;
    private String country;

    public User(){}

    public User(User user){
        this.id = user.id;
        this.name = user.name;
        this.surname = user.surname;
        this.age = user.age;
        this.email = user.email;
        this.country = user.country;
    }

    @Override
    public Copyable copy() {
        return new User(this);
    }
}
