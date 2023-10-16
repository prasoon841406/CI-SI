package in.spring.ci;

public class PetrolEngine implements Engine
{
	PetrolEngine()
	{
		System.out.println("PetrolEngine Constructer called");
	}
	public int start()
	{
		System.out.println("PetrolEngine started");
		return 1;
	}
}
