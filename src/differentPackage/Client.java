package differentPackage;

import org.test.Employee;

public class Client extends Employee {

	public void clientloc(){
		System.out.println("Usa");
	}
	public void clientName(){
		System.out.println("tcs");
	}
	public static void main(String[] args) {
		Client j=new Client();
		j.clientloc();
		j.clientName();
		j.EmpId();
		j.empName();
		j.location();
		
	}
	
	
	
}
