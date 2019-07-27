import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) {
        double x = 12.5, y = 6, z = -10;
        System.out.println("Введите число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = reader.readLine();
            double number = Double.parseDouble(inputString);

            if (number == x || number == y || number == z)
                System.out.println("Данное значение имеется в константах");
            else


                System.out.println("Такой константы нет!");
        } catch (Throwable t) {
            System.out.println("Необходимо вводить число!");
        }

    }
}

