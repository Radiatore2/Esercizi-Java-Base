package EX1SINGLETON;

public class EX1SINGLETON {
    public static void main(String[] args) {

        User user = User.getUsers();
        System.out.println(user);

        user.setName("Alice");
        user.setAge(28);
        System.out.println(user);
    }
}
