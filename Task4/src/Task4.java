import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите любое число в двоичном формате: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = reader.readLine();
            System.out.print("Введенное число, преобразованное в десятичный формат: ");
            System.out.println(Integer.parseInt(inputString , 2));


        } catch (Throwable t) {
            System.out.println("Необходимо ввести число в двоичном формате!");
        }

    }
}
