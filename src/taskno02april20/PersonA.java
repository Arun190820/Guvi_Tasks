package taskno02april20;

public class PersonA {
//Question no.04
	public String name;
    public int age;	
	
	public class Employee extends PersonA {
		int EmployeeID;
		int salary;
		
		
		public Employee() {
			super.name="Arun";
			super.age = 23;
		    this.EmployeeID = 2193;
		    this.salary = 25000;
		}


		public static void main(String[] args) {
			
		}
	}
}
