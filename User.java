/**
 * @(#)User.java
 *
 *
 * @author 
 * @version 1.00 2020/7/23
 */


public class User {

   	private String name;
   	private String icNo;
   	
   	public User(String name, String icNo)
   	{
   		this.name = name;
   		this.icNo = icNo;	
   	}
    
    public String toString()
    {	
    	return String.format("%-15s\t%-10s", name, icNo);
    }
}