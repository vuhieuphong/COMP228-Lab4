package lab4;

public class MultiplicationThread extends Thread
{
	int firstNumber;
	int secondNumber;
	public MultiplicationThread(int firstNumber,int secondNumber)
	{
		this.firstNumber=firstNumber;
		this.secondNumber=secondNumber;
	}
	public void run()
	{
		System.out.println("Multiplication: "+firstNumber+"*"+secondNumber
				+"="+(firstNumber*secondNumber));
	}
}
