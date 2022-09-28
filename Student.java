class Student
{
	private String id, name, course;
	private Double mark;
	
	public Student (String idIn, String nameIn, String courseIn, Double markIn)
	{
		this.id = idIn;
		this.name = nameIn;
		this.course = courseIn;
		this.mark = markIn;
	}
	
	public void printDetails()
	{
		System.out.println("Name: " + this.name + " " + "Course: " + this.course + " " + "Mark: " + " " + this.mark);
	}
}