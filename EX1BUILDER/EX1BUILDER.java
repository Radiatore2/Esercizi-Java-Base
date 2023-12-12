package EX1BUILDER;

public class EX1BUILDER {
    public static void main(String[] args) {
        PersonBuild builder = new PersonBuild();
        builder.setName("Andrea");
        builder.setSurname("Rossi");
        builder.setAge(29);
        builder.setAddress("Via Torino 29");
        Person io = builder.build();
        System.out.println(io);
    }

}
