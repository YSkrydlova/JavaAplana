import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task16 {
    public static void main(String[] args) {
        String s;
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Юленька\\IdeaProjects\\JavaAplana\\Task16\\src\\test.txt")))
        {while ((s = reader.readLine()) !=null)
        {
            System.out.println(s);
        }
        } catch (IOException exc) {
            System.out.println("Ошибка считывания файла!" + exc);
        }
    }
}
