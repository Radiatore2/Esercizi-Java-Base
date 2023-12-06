import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Marco", 20));
        students.add(new Student("Luca", 22));
        students.add(new Student("Anna", 21));
        students.add(new Student("Giovanni", 19));
        students.add(new Student("Giulia", 23));
        students.add(new Student("Francesca", 18));
        students.add(new Student("Alessandro", 24));
        students.add(new Student("Elena", 20));
        students.add(new Student("Matteo", 22));
        students.add(new Student("Sofia", 21));
        students.add(new Student("Davide", 19));
        students.add(new Student("Chiara", 23));




        Collections.sort(students, Comparator.comparingInt(Student::getAge));

        for (Student student : students) {
            System.out.println("Nome: " + student.getName() + ", Età: " + student.getAge());
        }
    }
}
