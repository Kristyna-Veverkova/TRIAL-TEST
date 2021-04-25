import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Path path = Paths.get("assets\\countchar.txt");
        try {
            HashMap<Character, Integer> countchar = Files.readAllLines(path);
        }
        try {
        catch(IOException e){
                System.err.println("File does not exist!");
            }
            for (String letter : countchar) {
                if (Character.isLetter(Integer.parseInt(letter))) {
                    if (!countchar.containsKey(letter)) {
                        countchar.put(letter, 1);
                    } else {
                        int n = 0;
                        countchar.put(letter, countchar.get(letter) + 1);
                    }
                }
            }
        }
        char maxLetter = " ";
        int value = 0;
        for (Map.Entry<Character, Integer> par : countchar.entrySet()) {
            int currentValue = par.getValue();
            if (currentValue > value) {
                maxLetter = par.getKey();
                value = currentValue;
            }
        }
        System.out.println(maxLetter + " : " + value);
    }
}
