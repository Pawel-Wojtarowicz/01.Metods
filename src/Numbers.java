import java.util.Scanner;
//https://www.samouczekprogramisty.pl/zestaw-cwiczen-dla-poczatkujacych-programistow/
//Excercise 3
public class Numbers {

    public static int Sum(int x, int y) {
        return x + y;
    }
    public static int Div(int x, int y) {
        return x - y;
    }
    public static int Multi(int x, int y) {
        return x * y;
    }
    //Excercise 4
    public static boolean isEven(int x) {
        {
            return (x % 2) == 0;
        }
    }
    //Excercise 5
    public static boolean isDiv(int x) {
        {
            return (x % 3) == 0 && (x % 5) == 0;
        }
    }

    public static void main(String[] args) {
        int x;
        int y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        x = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        y = scanner.nextInt();

        System.out.println("Wyniki: \n\nDodawanie: "+Sum(x,y)+"\nOdejmowanie: "+Div(x,y)+"\nMnożenie: "+Multi(x,y));
        System.out.println("Czy liczba jest parzysta?\n1. "+ isEven(x)+"\n2. "+isEven(y));
        System.out.println("Czy jest podzielna przez 3 i 5?\n1. "+isDiv(x)+"\n2. "+isDiv(y));

    }


}
