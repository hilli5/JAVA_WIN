/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.winneriu;

import java.util.ArrayList;

/**
 מכיל מערך של תרופות
 */
public class Inventory {
    
      protected ArrayList<Medicine> medicinesArray;

     public Inventory() {
        medicinesArray = new ArrayList<>();
    }
    
    
    public void addMedicine(Medicine m) throws Exception {
        if (isMedicineAlreadyExists(m.Medicinename)) {
            throw new MedicineAlreadyExistException();
        }
        medicinesArray.add(m);
    }
    
    //לבדוק אם תרופה קיימת
    private boolean isMedicineAlreadyExists(String medicineName) {
    for (Medicine medicine : medicinesArray) {
        if (medicine.getMedicinename().equals(medicineName)) {
            return true;  
        }
    }
    return false;  
}

    //חיפוש תרופה לפי שם
    public  Medicine searchMedicineByName(String Medicinename ) throws Exception{
        for (Medicine medicine : medicinesArray) {
            if(medicine.getMedicinename().equalsIgnoreCase(Medicinename)){
                System.out.println("its total Inventory: "+medicine.totalInventory());
                return medicine;
            }
        }
        throw new MedicineDoesNotExistException();
    }
    
    //החזרת רשימה לפי סוג
    public ArrayList<Medicine> searchMedicineByType(Medicine.MyEnum type){
        ArrayList<Medicine> medicines = new ArrayList<>();
          String typeString = type.name().toUpperCase();
         for (Medicine medicine : medicinesArray) {
            switch (typeString) {
            case "PILLS":
                if (medicine instanceof Pills) {
                    medicines.add(medicine);
                }
                break;
            case "SYRUP":
                if (medicine instanceof Syrup) {
                    medicines.add(medicine);
                }
                break;
            case "INHALER":
                if (medicine instanceof Inhaler) {
                    medicines.add(medicine);
                }
                break;
        }
        }
         if(medicines.isEmpty())
             return null;
        return medicines;
    }
    
    public ArrayList<Medicine> getMedicineInStock(){
        return this.medicinesArray;
    }
    
    
}
