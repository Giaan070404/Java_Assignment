public class Group {
    long id;
    String test;
    public Group(int id, String test) {
        this.id = id;
        this.test = test;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + test + '\'' +
                '}';
    }
}
