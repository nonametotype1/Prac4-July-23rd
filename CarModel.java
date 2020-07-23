/**
 * @(#)CarModel.java
 *
 *
 * @author 
 * @version 1.00 2020/7/23
 */


public class CarModel {

    private  String brand;
   	private  String model;
   	private  double capacity;
    
    public CarModel(String brand, String model, double capabity)
    {
    	this.brand=brand;
    	this.model=model;
    	this.capacity=capacity;
    }
    
    public String toString()
    {
    	return String.format("%-10s\t%-10s\t%-10s", this.brand, this.model, this.capacity);
    }
}