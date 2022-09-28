import java.util.Scanner;

public class Question2App
{
	public static void main (String[] args)
	{
		int i = 1;
		
		while(i <= 5)
		{
			Scanner scanner = new Scanner(System.in);
		
			System.out.println("Please enter the name of student");
			String id = scanner.nextLine();
			System.out.println("You entered: " + id);
			
			System.out.println("Please enter the name of student");
			String name = scanner.nextLine();
			System.out.println("You entered: " + name);
		
			System.out.println("Please enter the course name");
			String course = scanner.nextLine();
			System.out.println("You entered: " + course);
		
			System.out.println("Please enter the student mark");
			String str ="";
			str = scanner.nextLine();
			Double mark = Double.parseDouble(str);
		
			if(mark<0 || mark>100)
			{
				System.out.println("Rejected mark, must be within 0 and 100");
			}
			else
			{
				System.out.println("You entered: " + mark);
				Student y = new Student (id, name, course, mark);
				y.printDetails();
			}
			i++;
			
		}
		
		
	}
	
}