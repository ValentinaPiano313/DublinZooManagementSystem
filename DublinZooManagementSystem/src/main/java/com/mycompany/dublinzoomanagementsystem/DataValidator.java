/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dublinzoomanagementsystem;

/**
 *
 * @author vale
 */
public class DataValidator {
    
    public boolean validateTypeSpeciesName(String line){
         // Split the line into parts using a comma as the delimiter
        String[] splittedLine = line.split(",");

        if (splittedLine.length == 3) {
            // Extract type, species, and name
            String type = splittedLine[0].toLowerCase();
            String species = splittedLine[1].toLowerCase();
            String name = splittedLine[2].toLowerCase();

            // Validate the type 
            if ("mammal".equals(type) || "bird".equals(type) || "reptile".equals(type) || "fish".equals(type)) {
                // Valid type, continue validation
            } else {
                System.out.println("The type is invalid, please correct the file.");
                return false;
            }
            // Validate species (should not be empty)
            if (species.isEmpty() || !species.matches("[a-zA-Z]+")) {
                System.out.println("The species is invalid, it cannot be empty and can be text only.");
                return false;
            }

            // Validate name (should not be empty)
            if (name.isEmpty()) {
                System.out.println("The name is invalid, it cannot be empty.");
                return false;
            }
            return true;
        } else {
            // Incorrect number of parts
            System.out.println("The first line of the animal data must contain exactly three parts: type, species, name.");
            return false;
        }
    }
    
    
    public boolean validateHabitat(String line){
        
        String[] habitatList = {"polar", "tundra", "evergreen forests", "seasonal foresta", "grasslands", "desert", "tropical", "rain forest", "oceans"};
        String habitatToCheck = line.toLowerCase();

        if (habitatToCheck.isEmpty()) {
            System.out.println("The habitat is invalid, it cannot be empty.");
            return false;
        } 

        for (int i = 0; i < habitatList.length; i++) {
            if (habitatList[i].equals(habitatToCheck)) {
                return true; // Habitat is found
            }
        }

        // If no match is found after the loop
        System.out.println("The habitat is invalid, please correct the file.");
        return false;

    }
  
    
    public boolean validateDobWeight(String line){
        
        String[] splittedLine = line.split(","); // split the line into 2 parts using comma as a delimiter and save in an array.
        
        if (splittedLine.length == 2) {
            // Validattio for the Date of Birth (DOB)
           String[] splittedDob = splittedLine[0].split("/");
           if (splittedDob.length == 3) {
               try {
                   int year = Integer.parseInt(splittedDob[0]);
                   int month = Integer.parseInt(splittedDob[1]);
                   int  day = Integer.parseInt(splittedDob[2]);

                   // validation for day, month, and year ranges
                   if (year < 1900 || year > 2025 || month < 1 || month > 12 || day < 1 || day > 31 ) {
                       System.out.println("Date of Birth is invalid, please correct the file.");
                       return false;
                   }
               } catch (NumberFormatException ex) {
                   System.out.println("Date of Birth contains invalid numbers, please correct the file.");
                   return false;
               }
           }else {
               System.out.println("Date of Birth format is invalid, please correct the file. You must use YYYY/MM/DD format.");
               return false;
           }

           // Validate the Weight
           try {
               double weight = Double.parseDouble(splittedLine[1]);

               // Basic weight validation
               if (weight <= 0) {
                   System.out.println("Weight must be a positive number.");
                   return false;
               }
           } catch (NumberFormatException ex) {
               System.out.println("Weight contains invalid numbers, please correct the file.");
               return false;
           }

           // Both validations passed
           return true;
        } else {
          System.out.println("Input line must contain exactly two parts: Date of Birth and Weight. Please correct the file");
          return false;
        }
    }
}
