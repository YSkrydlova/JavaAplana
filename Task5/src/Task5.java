import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args)  {

        System.out.print("Введите число: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = reader.readLine();
            double number = Double.parseDouble(inputString);

            System.out.println(number + " *" + " 1 = " + number * 1);
            System.out.println(number + " *" + " 2 = " + number * 2);
            System.out.println(number + " *" + " 3 = " + number * 3);
            System.out.println(number + " *" + " 4 = " + number * 4);
            System.out.println(number + " *" + " 5 = " + number * 5);
            System.out.println(number + " *" + " 6 = " + number * 6);
            System.out.println(number + " *" + " 7 = " + number * 7);
            System.out.println(number + " *" + " 8 = " + number * 8);
            System.out.println(number + " *" + " 9 = " + number * 9);
            System.out.println(number + " *" + " 10 = " + number * 10);
        } catch (Throwable t) {
            System.out.println("Необходимо вводить число!");
        }
    }
}
