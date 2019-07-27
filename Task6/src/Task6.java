import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) {

        System.out.println("Введите число x: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = reader.readLine();
            double x = Double.parseDouble(inputString);
            System.out.println("Введите число y: ");
            inputString = reader.readLine();
            double y = Double.parseDouble(inputString);
            System.out.println("Введите число z: ");
            inputString = reader.readLine();
            double z = Double.parseDouble(inputString);


            double avg;
            avg = (x + y + z) / 3;
            System.out.println("Среднее арифметическое: "+ avg);
            avg = (int)(avg / 2);
                       if (avg > 3)
                System.out.println("Программа выполнена корректно");

        } catch (Throwable t){
            System.out.println("Необходимо вводить числа!");
        }



    }
}
