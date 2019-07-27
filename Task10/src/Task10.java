import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task10 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.println("Введите количество строк в массиве: ");
            String inputString = reader.readLine();
            int n = Integer.parseInt(inputString);
            System.out.println("Введите количество столбцов в массиве: ");
            inputString = reader.readLine();
            int m = Integer.parseInt(inputString);
            double massive[][] = new double[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.println("Введите элемент[" + i + "][" + j + "] массива: ");
                    inputString = reader.readLine();
                    double element = Double.parseDouble(inputString);
                    massive[i][j] = element;
                }
            }

            System.out.print("{");
            for (int j = 0; j < m; j++) {
                if (j != (m - 1))
                    System.out.print(massive[0][j] * 3 + ",");
                else System.out.print(massive[0][j] * 3);
            }
            System.out.println("}");
        } catch (
                Throwable t)

        {
            System.out.println("Размерность массива должна быть обозначена целым неотрицательным числом!");
        }
    }
}


