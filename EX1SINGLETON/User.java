package EX1SINGLETON;

public class User {
    private String name;
    private int age;

    private static User user1;

    public static User getUsers(){

        if (user1 == null){
            user1 = new User();
        }
        return user1;
    }

    private User(){

        this.name = "Andrea";
        this.age = 29;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
