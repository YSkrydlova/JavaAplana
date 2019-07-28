import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task14 {
    public static void main(String[] args) {
        System.out.println("Введите целое  число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            int x = Integer.parseInt(s);
            double y = x;
            System.out.println(s);
            System.out.println(x);
            System.out.println(y);

        } catch (Throwable t) {
            System.out.println("Требуется ввести целое число!");
        }

    }
}
