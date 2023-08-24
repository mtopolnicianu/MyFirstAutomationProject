package maps;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<String, Integer>();
        empIds.put("John", 12345);
        empIds.put("Carl", 12323);
        empIds.put("Jerry", 888);
        System.out.println(empIds);
        System.out.println(empIds.get("Carl"));
        System.out.println(empIds.containsKey("George"));
        System.out.println(empIds.containsValue(888));
        empIds.put("John", 98765);
        empIds.replace("John", 777);
        System.out.println(empIds);
    }
}
