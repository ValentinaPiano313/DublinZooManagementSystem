/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dublinzoomanagementsystem;

/**
 *
 * @author vale
 */
public class Bird extends Animal {
    
    // Field to represent the type of the animal (always "bird" by default)
    private String type= "bird";
    
    //Constructor for the Bird class.Initializes the fields inherited from the Animal class
    public Bird(String name, String habitat, String dob, double weight, String species) {
        super(name, habitat, dob, weight, species);
    }
    
    //Gets the type of the bird
    public String getType() {
        return type;
    }
    
    //Sets the type of the bird
    public void setType(String inType) {
        this.type = inType;
    }
}
