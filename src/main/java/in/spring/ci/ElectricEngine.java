package in.spring.ci;

public class ElectricEngine implements Engine
{
	ElectricEngine()
	{
		System.out.println("ElectricEngine constructor called");
	}
	public int start()
	{
		System.out.println("ElectricEngine started");
		return 1;
	}
}
