import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Person> pl = new ArrayList<Person>();

		Person p = new Person("Person",30);
		Teacher t = new Teacher("Teacher",50,"ENG");
		Employee e = new Employee("Employee",33,"EM001");
		PermanentEmployee pe = new PermanentEmployee("Permanent Employee",35,"EM002",15000);
		ContractEmployee ce = new ContractEmployee("Contract Employee",40,"EM003",9000);

		pl.add(p);
		pl.add(t);
		pl.add(e);
		pl.add(pe);
		pl.add(ce);

		for(Person p1:pl)
			p1.printDetails();

	}
}