package part5.Task37;

public enum SeasonOfYear {
    SUMMER("SUMMER"),
    WINTER("WINTER"),
    SPRING("SPRING"),
    AUTUMN("AUTUMN");

    private String description;
    private int countOFDAYS;

    SeasonOfYear(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return "our season is: " + description + "\n";
    }
}
