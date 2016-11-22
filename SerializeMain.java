/*package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeMain {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Employee emp = new Employee();
		emp.setEmployeeID(101);
		emp.setEmployeename("JOHN");
		emp.setDepartment("ECE");
		emp.setAddress("HYD");
		try{
			FileOutputStream fileOut = new FileOutputStream("E://emp1.txt");
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			outStream.writeObject(emp);
			outStream.close();
			fileOut.close();
		
		
		FileInputStream fileIn = new FileInputStream("E://emp1.txt");
		ObjectInputStream obj = new ObjectInputStream(fileIn);
		Employee e1 = (Employee)obj.readObject();
		System.out.println(e1.getEmployeeID());
		System.out.println(e1.getAddress());
		System.out.println(e1.getDepartment());
		}
catch(IOException e){
	e.printStackTrace();
}
	}

	class Employee implements Serializable{
		
		private int employeeID;
		private String employeename;
		private String department;
		transient private String address;
		
		public Employee()
		{
			
		}

		public int getEmployeeID() {
			return employeeID;
		}

		public void setEmployeeID(int employeeID) {
			this.employeeID = employeeID;
		}

		public String getEmployeename() {
			return employeename;
		}

		public void setEmployeename(String employeename) {
			this.employeename = employeename;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}





*/