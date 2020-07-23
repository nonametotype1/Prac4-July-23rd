import java.util.Scanner;/**
 * @(#)TestCarRegistration.java
 *
 *
 * @author 
 * @version 1.00 2020/7/23
 */


public class TestCarRegistration {
	
    public static void main(String[] args)
    {

        CarModel []typeList={new CarModel("Toyota","Vios",1.5), new CarModel("Nissan", "Teana", 2.0), new CarModel("Honda", "City", 1.6)};
        

        Registration []registration = new Registration[6];
  	  	
  		Scanner scanner = new Scanner(System.in);
  	
  		for (int i = 0; i <registration.length ; ++i)
  		{

  			System.out.println("\nRegistration number: " + Registration.nextRegisterNo);

            System.out.print("Enter owner name : ");
            String name = scanner.nextLine();
            System.out.print("Enter IC number : ");
            String icNo = scanner.nextLine();

            User owner = new User(name,icNo);

            System.out.print("Enter car plate no : ");
            String platenumber = scanner.nextLine();
            System.out.print("Enter car color: ");
            String color = scanner.next();
            System.out.print("Enter year : ");
            int year = scanner.nextInt();

            Car car = new Car(platenumber,color,year);  
            	              
  			System.out.println("\nCar Types: ");
  		
            for(int u=0; u<typeList.length;u++)
            {
            	System.out.println((u+1) + typeList[u].toString());
            }
               
  			System.out.print("\nSelect car type [1.." + typeList.length + "]: ");
  			int selection = scanner.nextInt();
  		
            CarModel selectedType = typeList[selection-1];
                
            Registration newReg = new Registration(car,selectedType,owner);
            registration[i] = newReg;
               
  			scanner.nextLine();
        }
        displayListing(registration);
  }
  
  	public static void displayListing(Registration[] regArr) 
  	{
  		System.out.printf("\n\n%50s\n", "Car Registration Listing");
  		System.out.printf("%-6s %-12s %-12s %-10s %-8s %-6s %-10s %-10s %5s\n", "Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
  		for (int i = 0; i < regArr.length; ++i) 
  		System.out.println(regArr[i]);
 	}
}
