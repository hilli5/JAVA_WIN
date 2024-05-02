/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.winneriu;

import java.util.Date;

 
public class Syrup extends Medicine{
    
    protected double bottelContent;

    public Syrup() {
    }

    public Syrup(double bottelContent, String Medicinename, String Companyname, String Companyemail, double Price, int Quantity, Date ExpirationYear) throws Exception {
        super(Medicinename, Companyname, Companyemail, Price, Quantity, ExpirationYear);
        this.bottelContent = bottelContent;
    }
    
    public double getBottelContent() {
        return bottelContent;
    }

    public void setBottelContent(double bottelContent) {
        this.bottelContent = bottelContent;
    }

    @Override
    public String toString() {
        return super.toString()+ "bottel Content:"+this.bottelContent;
    }

    //כמות התרופה במל
    @Override
    public double totalInventory() {
        return   this.Quantity*this.bottelContent;
    }
    
    
    
}
