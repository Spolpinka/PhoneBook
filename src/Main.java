import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numb = 20; // количество номеров в книге
        for (int i = 0; i < numb; i++) {
            PhoneBook.addPhoneNumber("Изя Хлебенштайн"+i, "+63" + (100000000 + random.nextInt(899999999)));
        }
        for (Map.Entry<String, String> entry: PhoneBook.getPhoneBook().entrySet()) {
            System.out.println("Имя абонента: " + entry.getValue() + ", телефон: " + entry.getKey());
        }
        System.out.println("конец работы программы!");
    }

}