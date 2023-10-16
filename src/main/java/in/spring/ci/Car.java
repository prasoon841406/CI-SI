package in.spring.ci;

public class Car
{
	private Engine eng;

	public void setEng(Engine eng)
	{
		System.out.println("Set Eng Method called");
		this.eng = eng;
	}

	public Car()
	{
		System.out.println("Car class Default constructor called");
	}



	Car(Engine eng)
	{
		System.out.println("Car class Parametrize constructor called");
		this.eng=eng;
	}
	public void drive()
	{
		int start=eng.start();

		if(start==1)
		{
			System.out.println("So, journey started");
		}
		else
		{
			System.out.println("Engine in trouble");
		}
	}
}
