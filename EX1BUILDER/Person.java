package EX1BUILDER;

public class Person {

  private String name;
  private String surname;
  private int age;
  private String address;

  Person(String name, String surname, int age, String address){

      this.name = name;
      this.surname = surname;
      this.age = age;
      this.address = address;
  }
  @Override
  public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
