import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = reader.readLine();
            System.out.print("Введенная строка без пробелов: \n" + inputString.replaceAll(" ",""));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
