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
 Abstract class Animal serves as a blueprint for different types of animals.It defines common properties and behaviors that all animal subclasses can inherit.
 */

public abstract class Animal {
    
    // Private fields to store the properties of an animal
    public String name;      // Name of the animal
    public String habitat;   // Habitat where the animal lives
    public String dob;       // Date of birth of the animal
    public double weight;    // Weight of the animal 
    public String species;   // Species classification of the animal
    public String comment;
    
    
    
   //Default constructor for the Animal class. Initializes the fields with default values.
    public Animal() {
        
        this.name = "name";
        this.habitat = "habitat";
        this.dob = "dob";
        this.weight = 0.00;
        this.species = "species";
        this.comment ="no comment";
        
    }
    
    //Parameterized constructor for the Animal class. Allows initialization of all fields with specified values.
    public Animal(String name, String habitat, String dob, double weight, String species, String comment) {
        this.name = name;
        this.habitat = habitat;
        this.dob = dob;
        this.weight = weight;
        this.species = species;
        this.comment = comment;
    }
    
    // method to get the date of birth of the animal.
    public String getDob() {
        return dob;
    }
    
    // method to set the date of birth of the animal.
    public void setDob(String inDob) {
        this.dob = inDob;
    }
    
    // method to get the habitat of the animal.
    public String getHabitat() {
        return habitat;
    }
    
    // method to set the habitat of the animal.
    public void setHabitat(String inHabitat) {
        this.habitat = inHabitat;
    }
    
    // method to get the name of the animal.
    public String getName() {
        return name;
    }
    
    // method to set the name of the animal.
    public void setName(String inName) {
        this.name = inName;
    }
    
    // method to get the species of the animal.
    public String getSpecies() {
        return species;
    }
    // method to set the species of the animal.
    public void setSpecies(String inSpecies) {
        this.species = inSpecies;
    }
    
    // method to get the weight of the animal.
    public double getWeight() {
        return weight;
    }
    
    // method to set the weight of the animal.
    public void setWeight(double inWeight) {
        this.weight = inWeight;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", habitat=" + habitat + ", dob=" + dob + ", weight=" + weight + "Kg, species=" + species + ", comment=" + comment + '}';
    }
    
    
    abstract String getType();
   
    }
