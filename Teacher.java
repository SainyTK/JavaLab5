public class Teacher extends Person
{

	private String faculty;

	public Teacher(String name,int age,String faculty)
	{
		super(name,age);
		this.faculty = faculty;
	}

	public String getFaculty()
	{
		return this.faculty;
	}

	public void setFaculty(String faculty)
	{
		this.faculty = faculty;
	}

	public void printDetails()
	{
		super.printDetails();
		System.out.println("Faculty: " + faculty);
	}
}