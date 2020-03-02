import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//https://www.samouczekprogramisty.pl/zestaw-cwiczen-dla-poczatkujacych-programistow/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> people = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            Person Person = new Person();
            System.out.println("Podaj imie: ");
            Person.setName(scanner.nextLine());
            people.add(Person.getName());
        }
        System.out.println("Lista osób: ");
        for (String element: people) {
            System.out.println(element);
        }
    }
}
