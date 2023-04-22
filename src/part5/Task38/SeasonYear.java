package part5.Task38;

public enum SeasonYear {
    SUMMER("SUMMER"),
    WINTER("WINTER"),
    SPRING("SPRING"),
    AUTUMN("AUTUMN");

    private String description;
    private int countOFDAYS;

    SeasonYear(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return "our season is: " + description + "\n";
    }

    public void countOfDay() {
        switch (description) {
            case "WINTER": {
                System.out.println("количество дней = " + (31 + 28 + 31));
                break;
            }
            case "SPRING": {
                System.out.println("количество дней = " + (31 + 30 + 31));
                break;
            }
            case "SUMMER": {
                System.out.println("количество дней = " + (30 + 31 + 31));
                break;
            }
            case "AUTUMN": {
                System.out.println("количество дней = " + (30 + 31 + 30));
                break;
            }
            default:
            {
                System.out.println("нет такого сезона");
                break;
            }
        }
    }
}
