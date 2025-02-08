/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dublinzoomanagementsystem;

import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author vale
 */
public class DublinZooManagementSystem {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int userOption;
        
        
        do{
            System.out.println("Welcome to the Dublin Zoo Management System");
            System.out.println("Please choose an option:");
            System.out.println("1 - Add new animals to the system");
            System.out.println("2 - View animals by their type");
            System.out.println("3 - View animals by their habitat");
            System.out.println("4 - View animals by their species");
            System.out.println("5 - View animals by their name");
            System.out.println("6 - Exit the program");
            System.out.println("Enter your choice:");        
            
            userOption = input.nextInt();
            
            
            
        }while(userOption != 6 );
        input.close();
        System.out.println("System closed");

    }
        
}

