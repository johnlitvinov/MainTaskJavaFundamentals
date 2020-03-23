import java.io.*;

// Задание 1:
// Приветствовать любого пользователя при вводе его имени через командную строку.
public class FirstTast {
    public static void main(String [] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("HI, " + name + "!");
    }
}
