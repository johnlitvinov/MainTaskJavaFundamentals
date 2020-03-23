import java.util.Scanner;

// Задание 4:
// Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
public class FourthTask {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int sumOfNumbers = firstNumber + secondNumber;
        System.out.println(sumOfNumbers);
    }
}
