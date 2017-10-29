/**
 * Purpose:     This class contains all necessary information for the Car class including: 
 *              definition, constructors,methods,<br>
 *                                                    <br>
 * Date:        October 28th, 2017
 * @author      Ryan White   
 * @version     1.5
 */

public class Car extends Vehicle {
//attributes
    final private static String vehicleType = "Car";
    final private String[] carTypeChoices = {"Sedan", "Coupe", "Wagon"};
    final private String[] hasTowingPackgeChoices = {"Towing package","No towing package"};
    private String carType;
    private String hasTowingPackage;



//constructors
/** 
* Default Constructor for Car initializes the object with arbitrary values.
*/
    public Car(){
        super(vehicleType);
        setCarType(carTypeChoices[showMenu("What type of Car is this?", carTypeChoices)]);
        setHasTowingPackage(hasTowingPackgeChoices[showMenu("Does this car have a towing package?", hasTowingPackgeChoices)]);
    }

//methods
    public String toString(){  
        return String.format("Car:\n\t  Model:   %-25s\n\t  Color:   %-25s\n\t  Cost:    $%.2f\n\t  Type:    %-25s\n\t  Towing:  %-25s\n", super.getModel(), super.getColor(), super.getCost(), carType, hasTowingPackage
        );
    }

//setters
    public void setCarType(String _carType){
        carType = _carType;
    }

    public void setHasTowingPackage(String _hasTowingPackage){
        hasTowingPackage = _hasTowingPackage;
    }

// getters
   public String getCarType(){
        return carType;
    }

    public String getTowingPackage(){
        return hasTowingPackage;
    }

}