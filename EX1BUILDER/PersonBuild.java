package EX1BUILDER;

public class PersonBuild {

    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuild(){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public PersonBuild setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public PersonBuild setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public PersonBuild setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuild setAddress(String address) {
        this.address = address;
        return this;
    }
    public Person build() {
        return new Person(name, surname, age, address);
    }
}
