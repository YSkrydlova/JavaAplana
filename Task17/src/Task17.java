import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task17 {
    public static void main(String[] args) {
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'end' ");
        try (FileWriter file = new FileWriter("text.txt")){
            do {
                System.out.print(": ");
                s=reader.readLine().trim();
                if (s.compareTo("end")==0) break;
                s=s+"\r\n";
                file.write(s);
            } while (s.compareTo("end") !=0);
        } catch (IOException exc) {
            System.out.println("шоибка ввода-вывода: "+ exc);
        }
    }
}
