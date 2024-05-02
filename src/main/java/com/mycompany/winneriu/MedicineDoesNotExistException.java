/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.winneriu;

/**
 *
 * @author User
 */
public class MedicineDoesNotExistException extends Exception{

  
    public MedicineDoesNotExistException() {
        System.out.println("Medicine Does Not Exist Exception");
    }

    
    public MedicineDoesNotExistException(String msg) {
        super(msg);
    }
}
