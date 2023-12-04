import java.util.ArrayList;

public class  Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();


        students.add(new Student("Marcello", 23));
        students.add(new Student("Luigi", 21));
        students.add(new Student("Giovanna", 22));
        students.add(new Student("Carla", 23));


        for (Student student : students) {
            System.out.println("Nome: " + student.getName() + ", Età: " + student.getAge());
        }
    }
}