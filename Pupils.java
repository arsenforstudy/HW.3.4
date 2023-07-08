import java.util.*;

public class Pupils {
    public static void main(String[] args) {

        //1

        String[] lastNames = {"Antonov", "Shevchenko", "Boiko", "Shevchenko", "Kravchenko", "Savytskiy", "Antonov",
                "Shevchenko", "Teteriv", "Mamchenko"};

        List<String> listNames = new ArrayList<>();

        for (String names : lastNames) {
            listNames.add(names);
        }
        System.out.println(listNames.size());


        //2

        Set<String> uniqueNames = new HashSet<>();

        for (String names : lastNames) {
            uniqueNames.add(names);
        }


        //3

        Map<String, Integer> namesLength = new HashMap<>();
        for (String name : lastNames) {
            namesLength.put(name, name.length());
        }
    }
}