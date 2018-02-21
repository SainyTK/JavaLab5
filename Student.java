public class Student extends Person
{

	private String major;
	private float gpa;

	public Student(String name, int age, String major,float gpa)
	{
		super(name,age);
		this.major = major;
		this.gpa = gpa;
	}

	public String getMajor()
	{
		return this.major;
	}

	public void setMajor(String major)
	{
		this.major = major;
	}

	public float getGpa()
	{
		return this.gpa;
	}

	public void setGpa(float gpa)
	{
		this.gpa = gpa;
	}

	public void printDetails()
	{
		super.printDetails();
		System.out.println("Major: " + major);
		System.out.println("GPA: " + gpa);
	}

}