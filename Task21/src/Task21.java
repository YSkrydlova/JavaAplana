import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task21 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Курс доллара=");
            String kurs = reader.readLine();
            double k = Double.parseDouble(kurs);
            System.out.println("Количество рублей: ");
            String rub = reader.readLine();
            double r = Double.parseDouble(rub);

            double dol=r/k;
            System.out.print("Итого: ");
            System.out.printf("%.2f", dol);

        } catch (Throwable t) {
            System.out.println("Ошибка в вводе данных!");
        }
    }
}
