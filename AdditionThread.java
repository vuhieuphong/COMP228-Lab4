package lab4;


public class AdditionThread extends Thread
{
	int firstNumber;
	int secondNumber;
	public AdditionThread(int firstNumber,int secondNumber)
	{
		this.firstNumber=firstNumber;
		this.secondNumber=secondNumber;
	}
	public void run()
	{
		System.out.println("Addition: "+firstNumber+"+"+secondNumber
				+"="+(firstNumber+secondNumber));
	}
}

