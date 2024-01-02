import java.util.Date;
import java.util.Objects;

public class Account {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (id != account.id) return false;
        if (!Objects.equals(email, account.email)) return false;
        if (!Objects.equals(userName, account.userName)) return false;
        if (!Objects.equals(fullName, account.fullName)) return false;
        return Objects.equals(createdDate, account.createdDate);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }

    long id;
    String email = "Email 1";
    String userName = "User name 1";
    String fullName = "Full name 1";
    Date createdDate;
}
