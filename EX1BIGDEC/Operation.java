package EX1BIGDEC;

public enum Operation {
    ADDIZIONE("+"),
    SOTTRAZIONE("-"),
    MOLTIPLICAZIONE("*"),
    DIVISIONE("/"),
    MIN("min"),
    MAX("max");

    private final String simbol;

    Operation(String simbol) {
        this.simbol = simbol;
    }
    public String getSimbol() {
        return this.simbol;
    }

}


