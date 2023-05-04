package part6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text;

        text = scan.nextLine();
        String[] words = text.split("\\s+");

        Map<String,Integer> map = new HashMap();

        for(String word:words){
            if(!map.containsKey(word)){
                map.put(word,1);
            }else {
                int count = map.get(word);
                map.put(word, count + 1);
            }
        }

        for(Map.Entry<String,Integer>word:map.entrySet()){
            System.out.println(word.getKey() + " " + word.getValue());
        }
    }
}
