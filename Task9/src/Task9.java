import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = reader.readLine();
            int n = Integer.parseInt(inputString);
            double massive[] = new double[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Введите " + (i + 1) + " элемент массива: ");
                inputString = reader.readLine();
                double element = Double.parseDouble(inputString);
                massive[i] = element;

            }
            System.out.print("{");
            for (int i = 0; i < n; i++) {
                if (i != (n - 1))
                    System.out.print(massive[i]*2 + ",");
                else System.out.print(massive[i]*2);
            }
            System.out.println("}");
            System.out.println(massive.length);
        } catch (Throwable t) {
            System.out.println("Размерность массива должна быть обозначена целым неотрицательным числом!");
        }
    }
}
