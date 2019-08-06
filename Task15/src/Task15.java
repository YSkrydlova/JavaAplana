import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task15 {
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
            for (int i=massive.length-1; i>0; i--){
                for (int j=0; j<i; j++){
                    if (massive[j]>massive[j+1]){
                        double x = massive[j];
                        massive[j]=massive[j+1];
                        massive[j+1]=x;
                    }
                }
            }
            System.out.print("{");
            for (int i = 0; i < n; i++) {
                if (i != (n - 1))
                    System.out.print(massive[i] + ",");
                else System.out.print(massive[i]);
            }
            System.out.println("}");

        }
        catch (Throwable t){
            System.out.println("Требуется ввести числовой массив!");
        }
    }
}
