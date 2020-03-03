
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


//https://www.samouczekprogramisty.pl/zestaw-cwiczen-dla-poczatkujacych-programistow/
//Excercise 1

public class AgeCalculator {

    public static int calculateYears(LocalDate birthDate) {
      LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
    public static int calculateMonths(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getMonths();
    }
    public static int calculateDays(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getDays();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj date urodzenia: yyyy-mm-dd");
        String string = scanner.nextLine();
        LocalDate birthDate;
        birthDate = LocalDate.parse(string);

        System.out.println("Masz "+calculateYears(birthDate)+" lat, "+calculateMonths(birthDate)+" miesięcy i "+calculateDays(birthDate)+" dni.");
    }
}
