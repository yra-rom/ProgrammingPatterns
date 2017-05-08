package prototype;


import lombok.Setter;

@Setter
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (surname != null ? !surname.equals(user.surname) : user.surname != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        return country != null ? country.equals(user.country) : user.country == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}
