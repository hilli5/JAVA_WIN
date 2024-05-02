/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.winneriu;

/**
 *
 * @author User
 */
public class InvalidEmailAddressException extends Exception{

    
    public InvalidEmailAddressException() {
        System.out.println("Invalid Email Address Exception");
    }

    
    public InvalidEmailAddressException(String msg) {
        super(msg);
    }
}
