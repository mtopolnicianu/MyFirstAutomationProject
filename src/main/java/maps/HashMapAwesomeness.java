package maps;

import java.util.HashMap;

public class HashMapAwesomeness {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 88;

        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);

        System.out.println(happy.get("c"));

        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("bobbyJoe1996", "FluffyP0nies!");
        fun.put("helloKittyFun", "password1223");
        fun.put("coolguyswag", "password123");
        System.out.println(fun.size());

        fun.remove("helloKittyFan21");
        System.out.println(fun.containsValue("password1223"));
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        capitalCities.get("England");
    }
}

