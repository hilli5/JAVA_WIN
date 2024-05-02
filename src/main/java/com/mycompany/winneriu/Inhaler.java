/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.winneriu;

import java.util.Date;


public class Inhaler extends Medicine{
    
   protected int amountOfClick;

    public Inhaler() {
    }

    public Inhaler(int amountOfClick, String Medicinename, String Companyname, String Companyemail, double Price, int Quantity, Date ExpirationYear) throws Exception {
        super(Medicinename, Companyname, Companyemail, Price, Quantity, ExpirationYear);
        this.amountOfClick = amountOfClick;
    }
    
    
    //מחזיר מספר לחיצות
    @Override
    public double totalInventory() {
        return this.Quantity*this.amountOfClick;
    }

    @Override
    public String toString() {
        return super.toString()+" amount Of Click:"+this.amountOfClick; 
    }
   
   
    
    
}
