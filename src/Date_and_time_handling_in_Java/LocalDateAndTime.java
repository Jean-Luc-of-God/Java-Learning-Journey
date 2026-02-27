package Date_and_time_handling_in_Java;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class LocalDateAndTime {

    public static void main(String[] args) {
        //System.out.println("Print " + LocalDate.now());
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.print("Enter the date(in this format: yyyy-mm-dd) : ");
        String date = sc.nextLine();
        LocalDate birthday = LocalDate.parse(date);

        System.out.println(birthday);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE,MMMM, dd,yyyy");

        String formattedBirthday = birthday.format(formatter);
        System.out.println("Your birthday is "+ formattedBirthday);


    }
}
