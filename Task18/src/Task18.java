import sun.net.ExtendedOptionsImpl;

import java.io.*;

public class Task18 {
    public static void main(String[] args) throws IOException {
        String s;
        int x = 0;
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Юленька\\IdeaProjects\\JavaAplana\\Task18\\src\\testtext.txt"));
        BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
        try {
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
                x++;
            }
            System.out.println("Количество строк в новом файле должно быть равно " + x);
            FileWriter writer = new FileWriter("C:\\Users\\Юленька\\IdeaProjects\\JavaAplana\\Task18\\src\\testtext.txt", false);
            for (int i = 1; i <= x; i++) {
                System.out.print("Введите строку " + i + " ");
                s = file.readLine();

                s = s + "\r\n";
                writer.write(s);
                writer.flush();

            }

        } catch (IOException t) {
            System.out.println("Ошибка считывания файла!" + t);
        }


    }
}
