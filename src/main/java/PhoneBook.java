import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, String> phoneNumbers = new HashMap<String, String>(); // phoneNumbers; names;

    public int add(String name, String number) {
        phoneNumbers.put(name, number);
        return phoneNumbers.size();
    }

    public String findByNumber(String name) {
        return null;
    }
}
