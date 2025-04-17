import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    private Map<String, String> phoneNumbers = new TreeMap<>(); // phoneNumbers; names;

    public int add(String name, String number) {
        phoneNumbers.put(name, number);
        return phoneNumbers.size();
    }

    public String findByNumber(String number) {
        for (Map.Entry<String, String> entry : phoneNumbers.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String findByName(String name) {
        for (Map.Entry<String, String> entry : phoneNumbers.entrySet()) {
            if (entry.getKey().equals(name)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void printAllNames() {
        for (String name : phoneNumbers.keySet()) {
            System.out.println(name);
        }
    }
}
