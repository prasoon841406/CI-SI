package in.spring.ci;

public class DieselEngine implements Engine
{
	DieselEngine()
	{
		System.out.println("DieselEngine constructor called");
	}
	public int start()
	{
		System.out.println("DieselEngine started");
		return 1;
	}
}
