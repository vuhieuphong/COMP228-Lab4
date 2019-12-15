package lab4;
import java.text.DecimalFormat;

public class DivisionThread extends Thread
{
	int firstNumber;
	int secondNumber;
	public DivisionThread(int firstNumber,int secondNumber)
	{
		this.firstNumber=firstNumber;
		this.secondNumber=secondNumber;
	}
	public void run()
	{
		DecimalFormat f = new DecimalFormat("0.00");
		System.out.println("Division: "+firstNumber+"/"+secondNumber
				+"="+f.format(firstNumber/(double)secondNumber));
	}
}
