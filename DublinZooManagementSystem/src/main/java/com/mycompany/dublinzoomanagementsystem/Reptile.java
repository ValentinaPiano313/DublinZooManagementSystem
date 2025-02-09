/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dublinzoomanagementsystem;

/**
 *
 * @author vale
 */
public class Reptile extends Animal {
    
     // Field to represent the type of the animal (always "reptile" by default)
    private String type= "reptile";
    
    //Constructor for the Reptile class.Initializes the fields inherited from the Animal class
    public Reptile(String name, String habitat, String dob, double weight, String species, String comment) {
        super(name, habitat, dob, weight, species, comment);
    }
    
    //Gets the type of the reptile
    public String getType() {
        return type;
    }
    
    //Sets the type of the reptile
    public void setType(String inType) {
        this.type = inType;
    }

    @Override
    public String toString() {
        return "Animal {" + "name=" + name + ", type =" + type +" habitat=" + habitat + ", dob=" + dob + ", weight=" + weight + "Kg, species=" + species + ", comment=" + comment + '}';
    }
    
    
    
}
