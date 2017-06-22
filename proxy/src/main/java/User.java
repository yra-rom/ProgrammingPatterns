import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class User implements Cloneable {
    private String id;
    private String name;
    private String surname;

    public User(User user){
        this.id = user.id;
        this.name = user.name;
        this.surname = user.surname;
    }

    @Override
    public User clone() {
        return new User(this);
    }
}
