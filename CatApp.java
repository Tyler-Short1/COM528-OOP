class CatApp
{
	public static void main (String[] args)
	{
		Cat flathead = new Cat("Flathead", 7, 10);
		Cat cupra = new Cat("Cupra", 2, 7);
		
		for (int i=1; i< 3; i++)
		{
			flathead.eat();
		}
		flathead.display();
		
		for (int i=1; i< 5; i++)
		{
			cupra.walk();
		}
		cupra.display();
		
	}
}