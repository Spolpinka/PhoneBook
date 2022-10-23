import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numb = 20; // количество номеров в книге
        PhoneBook pb = new PhoneBook();
        for (int i = 0; i < numb; i++) {
            pb.addPhoneNumber("Изя Хлебенштайн"+i, "+63" + (100000000 + random.nextInt(899999999)));
        }
        for (Map.Entry<String, String> entry: pb.getPhoneBook().entrySet()) {
            System.out.println("Имя абонента: " + entry.getValue() + ", телефон: " + entry.getKey());
        }
    }
}