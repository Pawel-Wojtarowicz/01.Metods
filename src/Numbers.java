import java.util.Scanner;
//https://www.samouczekprogramisty.pl/zestaw-cwiczen-dla-poczatkujacych-programistow/

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
    public static boolean isEven(int x) {
            return (x % 2) == 0;
    }
    public static boolean isDiv(int x) {
        return (x % 3) == 0 && (x % 5) == 0;
    }
    public static double toPow(int x) {
        return Math.pow(x, 3);
    }
    public static double toSqrt(int x) {
        return Math.sqrt(x);
    }
    /*
    public static boolean isRectangularTriangle(double x, double y, double z) {
        return Math.pow(x,2) + Math.pow(y, 2) == Math.pow(z, 2) ||
                Math.pow(x, 2) + Math.pow(z, 2) == Math.pow(y, 2) ||
                Math.pow(z, 2) + Math.pow(y, 2) == Math.pow(x, 2);
    }*/
    public static boolean isRectangularTriangle(double x, double y, double z) {
        return (x* x) + (y * y) == (z * z) ||
                (x * x) + (z * z) == (y * y) ||
                (z * z) + (y * y) == (x * x);
    }

    public static void main(String[] args) {
        int x, y;
        double a,b,c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe x: ");
        x = scanner.nextInt();
        System.out.println("Podaj liczbę y: ");
        y = scanner.nextInt();
        System.out.println("Podaj liczbę a: ");
        a = scanner.nextDouble();
        System.out.println("Podaj liczbę b: ");
        b = scanner.nextDouble();
        System.out.println("Podaj liczbę c: ");
        c = scanner.nextDouble();

        //Excercise 3
        System.out.println("Wyniki: \n\nDodawanie: "+Sum(x,y)+"\nOdejmowanie: "+Div(x,y)+"\nMnożenie: "+Multi(x,y));
        //Excercise 4
        System.out.println("Czy liczba jest parzysta?\nLiczba x. "+isEven(x)+"\nLiczba y. "+isEven(y));
        //Excercise 5
        System.out.println("Czy jest podzielna przez 3 i 5?\nx. "+isDiv(x)+"\ny. "+isDiv(y));
        //Excercise 6
        System.out.println("Liczba 'x' do ^3 to: "+toPow(x));
        //Excercise 7
        System.out.println("Pierwiastek kwadratowy liczby x to: "+toSqrt(x));
        //Excercise 8
        System.out.println("Czy da się utworzyć trójkąt protokątny: "+isRectangularTriangle(a,b,c));
    }
}
