import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task19 {
    public static void main(String[] args) {
        System.out.println("Введите число в бинарном формате: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = reader.readLine().trim();

            if (inputString.matches("[0-1]+")) {
                int j = 0, y = 0;

                for (int i = inputString.length() - 1; i >= 0; i--) {
                    int x = (int) (Character.getNumericValue(inputString.charAt(i)) * Math.pow(2, j));
                    y = y + x;
                    j++;
                }
                System.out.println("Число в десятичном формате: " + y);
            } else {
                System.out.println("Число должно состоять из символов 0 и 1");
            }
        } catch (Throwable t) {
            System.out.println("Требуется ввести число в бинарном формате!");
        }
    }
}
