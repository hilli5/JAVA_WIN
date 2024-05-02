/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.winneriu;
import java.util.ArrayList;
import java.util.Date;


public class Winneriu {

    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        
        try {
            
             Inventory medicine=new Inventory();
        //יצירת אוביקטים
            Pills p = new Pills(10,
                            "Aspirin",
                            "PharmaCo",
                            "info@pharmaco.com", 
                            5.99,
                            100, 
                            new Date(1/1/2025));
            Pills p2 = new Pills(10,
                            "qwe",
                            "PharmaCo",
                            "info@pharmaco.com", 
                            5.99,
                            100, 
                            new Date(1/1/2025));
            Syrup s = new Syrup(3,
                            "ABOCA",
                            "PharmaCo",
                            "info@pharmaco.com", 
                            30,
                            100, 
                            new Date(1/1/2025));
            
            Inhaler inhaler = new Inhaler(100,
                            "Alpa",
                            "PharmaCo",
                            "info@pharmaco.com", 
                            200,
                            20, 
                            new Date(1/1/2025));
            //הוספה למערך
            medicine.addMedicine(p);
            medicine.addMedicine(p2);
            medicine.addMedicine(s);
            medicine.addMedicine(inhaler);
            //חיפוש לפי שם  תרופה
            System.out.println("חיפוש לפי שם  תרופה");
            System.out.println( medicine.searchMedicineByName("Alpa").toString());
            System.out.println("חיפוש לפי סוג"); 
           //חיפוש לפי סוג
            ArrayList<Medicine> pillsList = medicine.searchMedicineByType(Medicine.MyEnum.PILLS);
            ArrayList<Medicine> syrupList = medicine.searchMedicineByType(Medicine.MyEnum.SYRUP);
            ArrayList<Medicine> inhalerList = medicine.searchMedicineByType(Medicine.MyEnum.INHALER);

            //הדפסת כל התרופות
             ArrayList<Medicine> allMedicine=medicine.getMedicineInStock();
            for (Medicine med : allMedicine) {
                System.out.println(med.toString());
            }
            //add existing medicine
                    // medicine.addMedicine(s);
            //חיפוש אחר תרופה לא קיימת
                    // System.out.println( medicine.searchMedicineByName("nj")); 
            //הוספת אובייקט עם אמייל לא נכון
            Inhaler inhaler2 = new Inhaler(200,
                            "Beita",
                            "PharmaCo",
                            "infopharmaco.com", 
                            200,
                            20, 
                            new Date(1/1/2027));
            medicine.addMedicine(inhaler2);
            
            System.out.println("bye");
            
        } catch (Exception e) {
        }
       
        
    }
}
