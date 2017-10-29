/**
 * Purpose:     This class contains all necessary information for the Truck class including: 
 *              definition, constructors,methods,<br>
 *                                                    <br>
 * Date:        October 28th, 2017
 * @author      Ryan White   
 * @version     1.5
 */

public class Truck extends Vehicle {
//attributes
    final private static String vehicleType = "Truck";
    private String[] truckSizeChoices = {"Half-ton", "Full-ton"};
    private String[] engineSizeChoices = {"1500", "3500"};
    private String truckSize;
    private String engineSize;    

//constructors
/** 
* Default Constructor for Truck initializes the object with arbitrary values.
*/
    public Truck(){
        super(vehicleType);
        int selection = showMenu("What size Truck is this?", truckSizeChoices);
        setTruckSize(truckSizeChoices[selection]);
        selection = showMenu("What is the engine size of the Truck?", engineSizeChoices);
        setEngineSize(engineSizeChoices[selection]);
    }

//methods
/**
 * Prints and formats all information about the Truck into an easily readable string.
 */
    public String toString(){  
        return String.format("Truck:\n\t  Model:   %-25s\n\t  Color:   %-25s\n\t  Cost:    $%.2f\n\t  Load:    %-25s\n\t  Engine:  %-25s\n", super.getModel(), super.getColor(), super.getCost(), truckSize, engineSize);
    }

// //setters
    public void setTruckSize(String _truckSize){
        truckSize = _truckSize;
    }

    public void setEngineSize(String _engineSize){
        engineSize = _engineSize;
    }

// //getters
    public String getTruckSize(){
        return truckSize;
    }

    public String getEngineSize(){
        return engineSize;
    }

}