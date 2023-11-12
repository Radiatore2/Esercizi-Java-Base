public class EX2STRBUILD {

    public static String uniCode (int index, String input) {

        StringBuilder x = new StringBuilder();

        if  (index<input.length()){
            x.append(input.charAt(index));
        } else {
            x.append("L'indice è superiore alla stringa");
        }

        return x.toString();
    }

    public static void main(String[] args) {

        System.out.println(uniCode(2, "Ciaone"));
    }
}
