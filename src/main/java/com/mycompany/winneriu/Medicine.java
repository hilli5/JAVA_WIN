/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.winneriu;

import java.util.Date;

public abstract class Medicine {
    
    protected enum MyEnum {
        PILLS,
        SYRUP,
        INHALER
    }
    protected  String Medicinename;   
    protected  String Companyname;
    protected  String Companyemail;
    protected  double Price ;
    protected int Quantity;
    protected Date ExpirationYear;

    public Medicine() {
    }

    public Medicine(String Medicinename,
                    String Companyname,
                    String Companyemail,
                    double Price, 
                    int Quantity,
                    Date ExpirationYear) throws  Exception{
        if (!isUpperCaseLettersOnly(Medicinename)) {
             Medicinename = Medicinename.toUpperCase();
        }
        if (!isValidEmail(Companyemail)) {
        throw new InvalidEmailAddressException();
        }
        this.Medicinename = Medicinename;
        this.Companyname = Companyname;
        this.Companyemail = Companyemail;
        this.Price = Price;
        this.Quantity = Quantity;
        this.ExpirationYear = ExpirationYear;
    }

    // בדיקת ולידציה לשם תרופה - רק אותיות גדולות
    private boolean isUpperCaseLettersOnly(String name) {
         return name.matches("[A-Z]+");
    }
    // בדיקת ולידציה לכתובת מייל
    private boolean isValidEmail(String email) {
    return email.matches("[^@]+@[^@]+\\.[a-zA-Z]+(\\.[0-9]+)*");
    }
    
    
    public String getCompanyemail() {
        return Companyemail;
    }

    public String getCompanyname() {
        return Companyname;
    }

    public Date getExpirationYear() {
        return ExpirationYear;
    }

    public String getMedicinename() {
        return Medicinename;
    }

    public double getPrice() {
        return Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setCompanyemail(String Companyemail) {
        this.Companyemail = Companyemail;
    }

    public void setCompanyname(String Companyname) {
        this.Companyname = Companyname;
    }

    public void setExpirationYear(Date ExpirationYear) {
        this.ExpirationYear = ExpirationYear;
    }

    public void setMedicinename(String Medicinename) {
        this.Medicinename = Medicinename;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    @Override
    public String toString() {
        return "Medicine Details: " +
               "\nMedicine Name: " + Medicinename +
               "\nCompany Name: " + Companyname +
               "\nCompany Email: " + Companyemail +
               "\nPrice: " + Price +
               "\nQuantity: " + Quantity +
               "\nExpiration Year: " + ExpirationYear;
    }

    
    public abstract double totalInventory();
    
    public boolean inStock(){
        return  this.Quantity>0;
    }
}
