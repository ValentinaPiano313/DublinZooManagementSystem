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
    public Bird(String name, String habitat, String dob, double weight, String species,String comment) {
        super(name, habitat, dob, weight, species, comment);
    }
    
    //Gets the type of the bird
    public String getType() {
        return type;
    }
    
    //Sets the type of the bird
    public void setType(String inType) {
        this.type = inType;
    }

    @Override
    public String toString() {
        return "Animal {" + "name=" + name + ", type =" + type +" habitat=" + habitat + ", dob=" + dob + ", weight=" + weight + ", species=" + species + ", comment=" + comment + '}';
    }
    
    
}
