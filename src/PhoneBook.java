import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }
    //а здесь комментарий о том, что это не обычная книга, а телефонная

    public HashMap<String, String> getPhoneBook() {
        return phoneBook;
    }

    public void addPhoneNumber(String name, String phone) {
        if (name != null && !name.isEmpty() && !name.isBlank() &&
                phone != null && !phone.isBlank() && !phone.isEmpty()) {
            phoneBook.put(phone, name);
        }
    }
}
