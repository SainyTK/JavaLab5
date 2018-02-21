public class ContractEmployee extends Employee
{
	public int payment;

	public ContractEmployee(String name,int age,String employeeId,int payment)
	{
		super(name,age,employeeId);
		this.payment = payment;
	}

	public int getPayment()
	{
		return this.payment;
	}

	public void setPayment(int payment)
	{
		this.payment = payment;
	}

	public void printDetails()
	{
		super.printDetails();
		System.out.println("Payment: " + payment);
	}
}