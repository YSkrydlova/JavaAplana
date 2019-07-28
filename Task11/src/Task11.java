import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Введите строку символов: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = reader.readLine();
            System.out.println("Раннее введенная строка: "+ inputString);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
