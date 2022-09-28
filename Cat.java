class Cat
{
  private String name;
  private int age, weight;

  public Cat (String nameIn, int ageIn, int weightIn)
  {
    this.name = nameIn;
    this.age = ageIn;
    this.weight = weightIn;
  }
  
  public void walk()
  {
	  this.weight--;
  }
  
  public void display()
  {
	  System.out.println("Name: " + this.name + " " + "age: " + this.age + " " + "Weight: " + " " + this.weight);
  }
	
  public void eat()
  {
	  this.weight++;
  }
}