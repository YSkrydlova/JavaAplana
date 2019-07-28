import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task13 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первую строку для сравнения длины: ");
        try {
            String inputString1 = reader.readLine();
            System.out.println("Введите вторую строку для сравнения длины: ");
            String inputString2 = reader.readLine();
            int leghtString1=inputString1.length(), leghtString2=inputString2.length();
           if (leghtString1==leghtString2) {
               System.out.println("Длины строк равны");}
               else
                   if (leghtString1>leghtString2){
                       System.out.println("Длина первой строки больше!");
            System.out.println(inputString1);}
               else {System.out.println("Длина второй строки больше!");
            System.out.println(inputString2);}

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
