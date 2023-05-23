import java.util.Optional;

public class Student {
    private String name;
    private Optional<Address> address = Optional.ofNullable(null);

    public Student(String name, Address address) {
        this.name = name;
        this.address = Optional.ofNullable(address);
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Optional<Address> getAddress() {
        return address;
    }
}
