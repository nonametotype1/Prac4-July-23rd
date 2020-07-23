/**
 * @(#)Car.java
 *
 *
 * @author 
 * @version 1.00 2020/7/23
 */


public class Car {
	
	private String plateNo;
	private String color;
	private int year;
    
    public Car(String plateNo, String color, int year )
    {
    	this.plateNo = plateNo;
    	this.color = color;
    	this.year = year;
    }
    
    public String toString()
    {
    	return String.format("%-11-s %-10s %5d", plateNo,color,year);
    }
}