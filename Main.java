import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		Person p = new Person("Person",30);
		p.printDetails();

		Student st = new Student("Student",20,"CoE",3.00f);
		st.printDetails();

		Teacher t = new Teacher("Teacher",50,"ENG");
		t.printDetails();

		Employee e = new Employee("Employee",33,"EM001");
		e.printDetails();

		PermanentEmployee pe = new PermanentEmployee("Permanent Employee",35,"EM002",15000);
		pe.printDetails();

		ContractEmployee ce = new ContractEmployee("Contract Employee",40,"EM003",9000);
		ce.printDetails();
	}
}