import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class MenstrualCycleApplication {

	public static void main(String[] args) {
		Scanner cycle = new Scanner(System.in);
		DateTimeFormatter dateConverter = DateTimeFormatter.ofPattern("day/month/year");

	
		System.out.print("Enter the start date of the last cycle (Your submission should be in Day/Month/Year format): ");
		String lastCycleDate = cycle.nextLine();
		LocalDate startDate = LocalDate.parse(lastCycleDate, dateConverter);











		/*} catch (DateTimeParseException err) {
			System.out.println("Invalid date format: " + err.getMessage());

		
		}*/



	}


}
