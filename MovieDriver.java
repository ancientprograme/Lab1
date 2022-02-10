import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Movie m1 = new Movie();
		Scanner answer = new Scanner(System.in);
		String choice;
		char desision = 'y';
		String Name;
		String Rating;
		int tickets;
		

		while (desision =='y')
		{
			// ask for the name of the movie 
			System.out.println("Enter the name of a moive:");
			Name = answer.nextLine();
			m1.setTitle(Name);
			// ask for movies rating
			System.out.println("Enter the rating of the moive:");
			Rating = answer.nextLine();
			m1.setRating(Rating);
			// ask for number of tickets sold
			System.out.println("Enter the number of tickets sold:");
			tickets = answer.nextInt();
			m1.setSoldTickets(tickets);
			System.out.println(m1);
			// ask whether you want to add another movie or not
			System.out.println("Do you want to enter another movie? (y or n)");
		
			
			choice = answer.next();
			desision = choice.charAt(0);
			//fix issue of skipping lines on loop
			Rating = answer.nextLine();
			if(desision == 'n')
			{
				System.out.println("Adios");
			}
			
		}
		
		
		
		
		answer.close();
	}

}
