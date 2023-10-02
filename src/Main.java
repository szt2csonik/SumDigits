import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy nem negatív egész számot: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("A szám nem lehet negatív.");
        } else {
            int digitSum = SumDigits(n);
            System.out.println(digitSum);
        }
    }
    public static int SumDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            int lastDigit = n % 10;
            int remainingDigits = n / 10;
            return lastDigit + SumDigits(remainingDigits);
        }
    }
}