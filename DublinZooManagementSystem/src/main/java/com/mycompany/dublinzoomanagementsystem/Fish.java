/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dublinzoomanagementsystem;

/**
 *
 * @author vale
 */

/*
 The Fish class is a subclass of the abstract Animal class.It represents animals of fish type and 
 extends the properties and methods of the Animal class.
 */
public class Fish extends Animal {
    
    // Field to represent the type of the animal (always "fish" by default)
    private String type= "fish";
    
    //Constructor for the Fish class.Initializes the fields inherited from the Animal class
    public Fish(String name, String habitat, String dob, double weight, String species) {
        super(name, habitat, dob, weight, species);
    }
    
    //Gets the type of the fish
    public String getType() {
        return type;
    }
    
    //Sets the type of the fish
    public void setType(String inType) {
        this.type = inType;
    }
}
