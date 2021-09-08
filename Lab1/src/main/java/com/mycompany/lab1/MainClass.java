/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.lab1;
import java.util.*;
/**
 *
 * @author nicka
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner getInput = new Scanner(System.in);
       
       int id;
       String Code;
       String className;
       System.out.println("Please enter the ID, the code, and the class name: ");
       
       id = getInput.nextInt();
       Code = getInput.next();
       className = getInput.next();
       
       
       Course course1 = new Course(id, Code, className);
        System.out.println("ID: " + course1.getID());
        System.out.println("Code: " + course1.getCode());
        System.out.println("Class Name: " + course1.getClassName());
        
       
        
    }
    
}
