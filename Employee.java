public class Employee extends Person
{

	private String employeeId;

	public Employee(String name,int age,String employeeId)
	{
		super(name,age);
		this.employeeId = employeeId;
	}

	public String getEmployeeId()
	{
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId)
	{
		this.employeeId = employeeId;
	}

	public void printDetails()
	{
		super.printDetails();
		System.out.println("Employee Id: " + employeeId);
	}

}