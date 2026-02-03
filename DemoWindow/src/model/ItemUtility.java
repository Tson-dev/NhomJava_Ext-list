/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nitro5
 */
public class ItemUtility {
   String itemName;
    int utility; 

    public ItemUtility(String name, int u) {
        this.itemName = name;
        this.utility = u;
    }
    public String getitemName(){
        return this.itemName;
        
    }
    public void setItem(String item){
        this.itemName = item;
    }
    public int getU(){
        return this.utility;
    }
    
}
