package lab4;

public class SubtractionThread extends Thread 
{
	int firstNumber;
	int secondNumber;
	public SubtractionThread(int firstNumber,int secondNumber)
	{
		this.firstNumber=firstNumber;
		this.secondNumber=secondNumber;
	}
	public void run()
	{
		System.out.println("Subtraction: "+firstNumber+"-"+secondNumber
				+"="+(firstNumber-secondNumber));
	}
}
