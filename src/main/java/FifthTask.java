import java.util.Scanner;

// Задание 5:
// Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
public class FifthTask {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("January");
        } if (number == 2) {
            System.out.println("February");
        } if (number == 3) {
            System.out.println("March");
        } if (number == 4) {
            System.out.println("April");
        }if (number == 5) {
            System.out.println("May");
        }if (number == 6) {
            System.out.println("June");
        }if (number == 7) {
            System.out.println("July");
        }if (number == 8) {
            System.out.println("August");
        }if (number == 9) {
            System.out.println("September");
        }if (number == 10) {
            System.out.println("October");
        }if (number == 11) {
            System.out.println("November");
        }if (number == 12) {
            System.out.println("December");
        } else {
            System.out.println("Not the correct number, check it and retry, please!");
        }
    }
}



