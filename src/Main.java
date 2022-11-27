import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kalkulator\n1.Dodaj\n2.Odejmij");

        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        switch (x) {
            case "1":
                double A, B;
                System.out.println("Podaj liczbe");
                A = scan.nextDouble();
                System.out.println("Podaj drugą");
                B = scan.nextDouble();
                Dodawanie Dodana = new Dodawanie();
                System.out.println(Dodana.Dodaj(A, B));
                break;
            case "2":
                double C, D;
                System.out.println("Podaj liczbe");
                C = scan.nextDouble();
                System.out.println("Podaj drugą");
                D = scan.nextDouble();
                Odejmowanie Odjenta = new Odejmowanie();
                System.out.println(Odjenta.Odejmij(C, D));
                break;
            default:
        }
    }
}