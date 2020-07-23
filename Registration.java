/**
 * @(#)Registration.java
 *
 *
 * @author 
 * @version 1.00 2020/7/23
 */


public class Registration {
    
    static int nextRegisterNo = 1001;
    private int registerNo;
    private Car car;
    private CarModel carType;
    private User owner;
    
    
    public Registration(Car car, CarModel carType,User owner) {
        this.car = car;
        this.carType = carType;
        this.owner = owner;
        registerNo= nextRegisterNo;
        
        nextRegisterNo++;
    }

    public String toString()
    {
         return String.format("%d %s %s %s" ,registerNo, owner.toString(),  car.toString(),carType.toString());
    }
    
}
