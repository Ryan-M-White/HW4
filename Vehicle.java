/**
 * Purpose:     This class allows me to put Car and Truck in the same collection<br>
 * Date:        October 28th, 2017
 * @author      Ryan White   
 * @version     1.5
 */
import java.util.*;
public abstract class Vehicle {
    private String model;
    private String color;
    private double cost;

    public Vehicle (String vehicleType){
        Scanner sc = new Scanner(System.in);
        Scanner wholeLineSC = new Scanner(System.in).useDelimiter("\\n");
        
        System.out.println("Entering " + vehicleType + " Order: ");
        System.out.print("\t\tModel: ");
        String model = wholeLineSC.next();
        setModel(model);
        System.out.print("\t\tColor: ");
        String color = wholeLineSC.next();
        setColor(color);
        System.out.print("\t\tCost: ");				
        while (!sc.hasNextDouble()) {
            System.out.println("");
            System.out.println("");	
            System.out.println("That's not a number! Please try again.");
            System.out.print("\t\tCost: ");
            sc.next();
        }
        Double cost = sc.nextDouble();
        setCost(cost);

        sc.close();
		wholeLineSC.close();
    }

//methods
    public int showMenu(String prompt, String[] choices){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        String choiceIdentifiers = "";
        int choice;
        for(int i = 0; i < choices.length; i++){
            Integer j = i+1;
            System.out.println("\t\t" + j + ". " + choices[i]);
            choiceIdentifiers = choiceIdentifiers + j.toString();
        }
        System.out.print("Choice: ");				
        while (!sc.hasNext("[" + choiceIdentifiers +"]")) {
            System.out.println("");
            System.out.println("");	
            System.out.println("That's not an option! Please try again.");
            System.out.println(prompt);
            for(int i = 0; i < choices.length; i++){
                System.out.println("\t\t" + (i+1) + ". " + choices[i]);
            }
            System.out.print("Choice: ");
            sc.next();
        }
        choice = Integer.parseInt(sc.next());
        sc.close();
        return choice;
    }

//getters
    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public Double getCost(){
        return cost;
    }

//setters
    public void setModel(String _model){
        _model = _model.replace("\n", "").replace("\r", "");
        model = _model;
    }

    public void setColor(String _color){
        _color = _color.replace("\n", "").replace("\r", "");
        color = _color;
    }

    public void setCost(Double _cost){
        cost = _cost;
    }


    
}