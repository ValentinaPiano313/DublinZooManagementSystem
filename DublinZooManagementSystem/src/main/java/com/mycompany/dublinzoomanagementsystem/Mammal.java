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
 The Mammal class is a subclass of the abstract Animal class.It represents animals of mammals type and 
 extends the properties and behaviors of the Animal class.
 */
public class Mammal extends Animal {
    
     // Field to represent the type of the animal (always "mammal" by default)
    private String type= "mammal";
    
    //Constructor for the Mammal class.Initializes the fields inherited from the Animal class
    public Mammal(String name, String habitat, String dob, double weight, String species,String comment) {
        super(name, habitat, dob, weight, species, comment);
    }
    
    //Gets the type of the mammal
    public String getType() {
        return type;
    }
    
    //Sets the type of the mammal
    public void setType(String inType) {
        this.type = inType;
    }
    
}
