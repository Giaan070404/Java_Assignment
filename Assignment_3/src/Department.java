import java.util.Objects;

public class Department {
    public int id;
    public String name;
    public String address;
    public int totalmenber;

    public Department(int id, String name, String address, int totalmenber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.totalmenber = totalmenber;
    }
    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", diaChi='" + address + '\'' +
                ", totalmenber=" + totalmenber +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public char charAt(int i) {
        return 0;
    }


    public int length() {
        return 0;
    }
}
