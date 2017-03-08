package prototype;

public class User implements Copyable {
    private String id;
    private String name;
    private String surname;
    private int age;
    private String email;
    private String country;

    private User(User user){
        this.id = user.id;
        this.name = user.name;
        this.surname = user.surname;
        this.age = user.age;
        this.email = user.email;
        this.country = user.country;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public Copyable copy() {
        return new User(this);
    }
}
