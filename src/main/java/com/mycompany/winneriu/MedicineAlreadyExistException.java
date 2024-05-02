/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.winneriu;

/**
 *
 * @author User
 */
public class MedicineAlreadyExistException extends Exception{

   
    public MedicineAlreadyExistException()  {
        System.out.println("Medicine Already Exist Exception");
    }

    
    public MedicineAlreadyExistException(String msg) {
        super(msg);
    }
}
