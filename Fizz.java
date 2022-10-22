import java.util.Scanner;

public class Fizz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj zakres liczb do sprawdzenia podzielnych przez 3i5  3 oraz 5");
        System.out.println("Podaj pierwsza liczbe");
        int a = sc.nextInt();
        System.out.println("Podaj druga liczbe");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz buzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println(" buzz " + i);
            } else
                System.out.println(i);

        }

    }
}