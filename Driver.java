package lab4;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		System.out.println("=====Welcome to Java Thread Calulator=====\n");
		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			System.out.print("Do you want to make calculations? (y/n): ");
			String continueChoice=scanner.next();
			if(continueChoice.equals("y"))
			{
				System.out.print("\nEnter a first integer: ");
				while(!scanner.hasNextInt())
				{
					scanner=new Scanner(System.in);
					System.out.print("Invalid. Enter another first integer: ");
				}
				int firstNumber=scanner.nextInt();
				System.out.print("Enter a second integer: ");
				while(!scanner.hasNextInt())
				{
					scanner=new Scanner(System.in);
					System.out.print("Invalid. Enter another second integer: ");
				}
				int secondNumber=scanner.nextInt();
				
				System.out.print("\nDo you want calculation order? (y/n): ");
				String orderChoice=scanner.next();
				
				while(true)
				{
					if(orderChoice.equals("y"))
					{
						System.out.println("\nCalculation order is +,-,*,/");
						break;
					}
					else if(orderChoice.equals("n"))
					{
						System.out.println("\nNo calculation order is applied");
						break;
					}
					else
					{
						scanner=new Scanner(System.in);
						System.out.print("Invalid. Do you want calculation order? (y/n): ");
						orderChoice=scanner.next();
					}
				}
				
				AdditionThread addition=new AdditionThread(firstNumber, secondNumber);
				SubtractionThread subtraction=new SubtractionThread(firstNumber, secondNumber);
				MultiplicationThread multiplication=new MultiplicationThread(firstNumber, secondNumber);
				DivisionThread division=new DivisionThread(firstNumber, secondNumber);
				
				addition.start();
				if(orderChoice.equals("y"))
				try {
					{
						addition.join();
						Thread.sleep(750);
					}
				} catch (InterruptedException e) {
					System.out.println("Addition thread interrupted");
				}
				subtraction.start();
				if(orderChoice.equals("y"))
				try {
					{
						subtraction.join();	
						Thread.sleep(750);
					}
				} catch (InterruptedException e) {
					System.out.println("Subtraction thread interrupted");
				}
				multiplication.start();
				if(orderChoice.equals("y"))
				try {
					{
						multiplication.join();	
						Thread.sleep(750);
					}
				} catch (InterruptedException e) {
					System.out.println("Multiplication thread interrupted");
				}
				division.start();	
				try {
					Thread.sleep(750);
				} catch (InterruptedException e) {
					System.out.println("Division thread interrupted");
				}
				System.out.println();
			}
			else if(continueChoice.equals("n"))
			{
				System.out.println("Goodbye!");
				break;
			}
			else 
			{
				System.out.print("Invalid. ");	
			}
		}
		scanner.close();
	}

}
