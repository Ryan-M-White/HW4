/**
 * Purpose:     This class contains all necessary information for the Boat class including: 
 *              definition, constructors,methods,<br>
 *                                                    <br>
 * Date:        October 28th, 2017
 * @author      Ryan White   
 * @version     1.0
 */

public class Boat extends Vehicle {
    //attributes
        final private static String vehicleType = "Boat";
        final private String[] boatTypeChoices = {"Pontoon", "PWC", "Sailboat"};
        final private String[] boatMaterialChoices = {"Wood", "Fiberglass", "Steel"};
        private String boatType;
        private String boatMaterial; //what the boat is made out of
    
    //constructors
    /** 
    * Default Constructor for Boat initializes the object with user input.
    */
        public Boat(){
            super(vehicleType);
            setBoatType(boatTypeChoices[showMenu("What type of boat is this?", boatTypeChoices)]);
            setBoatMaterial(boatMaterialChoices[showMenu("What is the boat's construction?", boatMaterialChoices)]);
        }
    
    //methods
    /**
     * Prints and formats all information about the Truck into an easily readable string.
     */
        public String toString(){  
            return String.format("Boat:\n\t  Model:   %-25s\n\t  Color:   %-25s\n\t  Cost:    $%.2f\n\t  Type:    %-25s\n\t  Made of:%-25s\n", super.getModel(), super.getColor(), super.getCost(), boatType, boatMaterial);
        }
    
    // //setters
        public void setBoatType(String _boatType){
            boatType = _boatType;
        }
    
        public void setBoatMaterial(String _boatMaterial){
            boatMaterial = _boatMaterial;
        }
    
    // //getters
        public String getBoatType(){
            return boatType;
        }
    
        public String getBoatMaterial(){
            return boatMaterial;
        }
    
    }