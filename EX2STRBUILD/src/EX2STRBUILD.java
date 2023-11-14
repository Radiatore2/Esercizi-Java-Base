public class EX2STRBUILD {

    public static String uniCode (int index, String input) {

        StringBuilder x = new StringBuilder();

        if  (index<input.length()){
            String charValue = Integer.toHexString(input.charAt(index));

            x.append("\\u");

            for (int i = charValue.length(); i < 4; i++) {
                x.append("0");
            }
            x.append(charValue);
        } else {
            x.append("L'indice è superiore alla stringa");
        }

        return x.toString();
    }

    public static void main(String[] args) {

        System.out.println(uniCode(2, "Ciaone"));
    }
}
