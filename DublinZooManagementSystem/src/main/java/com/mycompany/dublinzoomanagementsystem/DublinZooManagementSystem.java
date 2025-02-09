/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dublinzoomanagementsystem;

import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author vale
 */
public class DublinZooManagementSystem {
    
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      int userOption;
      List<Animal> animalsSaved = new ArrayList<>();  // List to store animals
        
      do{    // Displaying the main menu to the user
            System.out.println("Welcome to the Dublin Zoo Management System");
            System.out.println("Please choose an option:");
            System.out.println("1 - Add new animals to the system");
            System.out.println("2 - View animals by their type");
            System.out.println("3 - View animals by their habitat");
            System.out.println("4 - View animals by their species");
            System.out.println("5 - View animals by their name");
            System.out.println("6 - Exit the program");
            System.out.println("Enter your choice:");        
            
            userOption = input.nextInt(); // Get the user's choice
            
            switch (userOption){
                
                case 1:
                        // try block attempt to read from a file and handle exceptions
                    try (FileReader inFile = new FileReader("animals.txt");// FileReader for reading the input file
                         BufferedReader bufferR = new BufferedReader(inFile)) {//BufferedReader for efficient reading of text from the input file
 
                        // if the try block pass this code is execute
                        System.out.println("File found. Reading animals data...");
                        String line;
                        String[] dataRead = new String[4];  // Declaration and assignment of an array to store lines read from the file,which contain the data needed for the program. This array can hold up to 4 strings.
                        int lineCount = 0;//// Counter to track the number of lines read to validate every animal data
                        int fileLineCounter = 0; // line counter of the entire file
                        DataValidator validation = new DataValidator();//Validator object to validate input data

                         // Variables to store individual animal attributes
                        String type = "", species = "", name = "", habitat = "", dob = "", comment = "";
                        double weight = 0.0;

                        while ((line = bufferR.readLine()) != null) {//loop to read the complete file
                            fileLineCounter++;
                            dataRead[lineCount % 4] = line;  // Store each line in the array

                            if (lineCount % 4 == 3) {  // when we have 4 line read we can start to eleborate the data
                                
                                // Validate and parse the type, species, and name
                                if (validation.validateTypeSpeciesName(dataRead[0]) == null) {
                                    System.out.println("Error present at line: " + (fileLineCounter - 3));
                                } else {
                                    String[] firstLine = validation.validateTypeSpeciesName(dataRead[0]);
                                    type = firstLine[0].toLowerCase();
                                    species = firstLine[1].toLowerCase();
                                    name = firstLine[2].toLowerCase();
                                }

                                // Validate and parse the habitat
                                if (validation.validateHabitat(dataRead[1]) == null) {
                                    System.out.println("Error present at line: " + (fileLineCounter - 2));
                                } else {
                                    habitat = validation.validateHabitat(dataRead[1]).toLowerCase();
                                }

                                // Validate and parse the date of birth and weight
                                if (!validation.validateDobWeight(dataRead[2])) {
                                    System.out.println("Error present at line: " + (fileLineCounter - 1));
                                } else {
                                    String[] line3 = dataRead[2].split(",");
                                    dob = line3[0];
                                    weight = Double.parseDouble(line3[1]);
                                }

                                // Check if a comment is present; otherwise, set a default message
                                if (dataRead[3].isEmpty()) {
                                    comment = "no comment left about this animal.";
                                } else {
                                    comment = dataRead[3];
                                }

                                // Create the appropriate subclass object based on the animal type and add it to the list
                                if ("mammal".equals(type)) {
                                    animalsSaved.add(new Mammal(name, habitat, dob, weight, species, comment));
                                } else if ("reptile".equals(type)) {
                                    animalsSaved.add(new Reptile(name, habitat, dob, weight, species, comment));
                                } else if ("fish".equals(type)) {
                                    animalsSaved.add(new Fish(name, habitat, dob, weight, species, comment));
                                } else {
                                    animalsSaved.add(new Bird(name, habitat, dob, weight, species, comment));
                                }
                            }

                            lineCount++;// Increment the line count for grouping
                        }

                        System.out.println("Animal saved on the system!!");
             
                    } catch (IOException ex) {// Handle errors while reading the file
                        System.out.println("An error occurred while reading the file: " + ex.getMessage());
                    }
                    break;
            }
     }while(userOption != 6 );
        input.close();
        System.out.println("System closed");
}
}        