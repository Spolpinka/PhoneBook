import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public HashMap<String, String> getPhoneBook() {
        return phoneBook;
    }

    public void addPhoneNumber(String name, String phone) {
        phoneBook.put(phone, name);
    }
}
