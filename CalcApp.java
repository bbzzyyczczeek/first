import java.util.Scanner;

public class CalcApp {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        Information info =new Information();
        System.out.println("Podaj liczbe dni pracujacych w tym miesiacu");
     info.setDniPracujace(sc.nextInt());
        System.out.println("Podaj licze przepracowanych godzin w dni swiateczne");
        info.setGodzinyWdniSwiateczne(sc.nextInt());
        System.out.println("Podaj licze dni urlopu w tym miesiacu");
        info.setUrlop(sc.nextInt());
        System.out.println("Podaj licze dni przebywania na zwolnieniu lekarskim w dni pracujace w tym miesiacu");
        info.setZwolnieneLekarskie(sc.nextInt());
        System.out.println("Podaj licze dni przebywania na zwolnieniu lekarskim w dni swiateczne w tym miesiacu");
        info.setZwolnieneLekarskieWswieta(sc.nextInt());



           Jobb.jobb();



        System.out.println( info);



    }
}
