import java.util.Scanner;

public class Fizz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj zakres liczb do sprawdzenia");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <=b ; i++) {
            if (i%3==0&&i%5==0) {
                System.out.println("Fizz buzz "+i);
            } else if (i%3==0) {
                System.out.println("Fizz "+i);
            } else if (i%5==0) {
                System.out.println(" buzz "+i);
            }
            else
                System.out.println(i);

            }

