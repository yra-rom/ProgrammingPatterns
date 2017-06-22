import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User{
    private String id;
    private String name;
    private String surname;
    private int age;
    private String email;
    private String country;

    private User(UserBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.email = builder.email;
        this.country = builder.country;
    }

    public static class UserBuilder{
        private String id;
        private String name;
        private String surname;
        private int age;
        private String email;
        private String country;

        public UserBuilder id(String id){
            this.id = id;
            return this;
        }

        public UserBuilder name(String name){
            this.name = name;
            return this;
        }

        public UserBuilder surname(String surname){
            this.surname = surname;
            return this;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public UserBuilder country(String country){
            this.country = country;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }
}
