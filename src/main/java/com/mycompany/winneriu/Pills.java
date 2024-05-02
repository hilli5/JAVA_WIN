/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.winneriu;

import java.util.Date;


public class Pills extends Medicine{
    
    protected  int numOfPillsInBox;

    public Pills() {
        
    }


    public Pills(int numOfPillsInBox, String Medicinename, String Companyname, String Companyemail, double Price, int Quantity, Date ExpirationYear) throws Exception {
        super(Medicinename, Companyname, Companyemail, Price, Quantity, ExpirationYear);
        this.numOfPillsInBox = numOfPillsInBox;
    }

    @Override
    public double totalInventory() {
        return this.numOfPillsInBox*this.Quantity;
    }

    public int getNumOfPillsInBox() {
        return numOfPillsInBox;
    }

    public void setNumOfPillsInBox(int numOfPillsInBox) {
        this.numOfPillsInBox = numOfPillsInBox;
    }

    @Override
    public String toString() {
        return super.toString() + "num Of Pills In Box"+this.numOfPillsInBox; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    } 
}
