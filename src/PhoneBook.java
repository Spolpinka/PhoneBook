import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static HashMap<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public static HashMap<String, String> getPhoneBook() {
        return phoneBook;
    }

    public static void addPhoneNumber(String name, String phone) {
        if (name != null && !name.isEmpty() && !name.isBlank() &&
                phone != null && !phone.isBlank() && !phone.isEmpty()) {
            phoneBook.put(phone, name);
        }
    }
}
