package part5.Task37;

import java.util.Scanner;

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

    public void nextSeason(){


        switch (description){
            case "WINTER": {
                String nextSeasonOfYear = "SPRING";

                System.out.println(nextSeasonOfYear);
                break;
            }
            case "SPRING": {
                String nextSeasonOfYear = "SUMMER";

                System.out.println(nextSeasonOfYear);
                break;
            }
            case "SUMMER": {
                String nextSeasonOfYear = "AUTUMN";

                System.out.println(nextSeasonOfYear);
                break;
            }
            case "AUTUMN": {
                String nextSeasonOfYear = "WINTER";

                System.out.println(nextSeasonOfYear);
                break;
            }
            default: {
                System.out.println("нет такого сезона");
                break;
            }
        }

    }


}
