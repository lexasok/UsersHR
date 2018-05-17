import java.util.Set;

public class User {

    String username;
    String password;
    int age;
    Set<Integer> orderIDs;

    public User(String customUsername, String customPassword, int customAge, Set<Integer> orderIDs) {
        this.username = customUsername;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }

    public static void main(String[] args) {

    }
}
