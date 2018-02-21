public class PermanentEmployee extends Employee
{
	public int salary;

	public PermanentEmployee(String name,int age,String employeeId,int salary)
	{
		super(name,age,employeeId);
		this.salary = salary;
	}

	public int getSalary()
	{
		return this.salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public void printDetails()
	{
		super.printDetails();
		System.out.println("Salary: " + salary);
	}
}