public class TestEmployee 
{

	public static void main(String[] args)// main
	{
	      // Test constructor and toString()
	      Employee e1 = new Employee(4, "Chanchal", "kumar", 3200);
	      System.out.println(e1);  // toString();

	      // Test Setters and Getters
	      e1.setSalary(555);
	      System.out.println(e1);  // toString();
	      System.out.println("id is: " + e1.getId());
	      System.out.println("firstname is: " + e1.getFirstName());
	      System.out.println("lastname is: " + e1.getLastName());
	      System.out.println("salary is: " + e1.getSalary());

	      System.out.println("name is: " + e1.getName());
	      System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

	      // Test raiseSalary()
	      System.out.println(e1.getraiseSalary(10));
	      System.out.println(e1);
	   }

}