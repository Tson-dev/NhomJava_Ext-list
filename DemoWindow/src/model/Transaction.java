/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Nitro5
 */
public class Transaction {
    int tid;
    ArrayList<ItemUtility> items;
    int tu;
    public Transaction(int tid,int tu){
        this.tid = tid;
        this.items = null;
        this.tu = items.stream().mapToInt(i -> i.utility).sum();
    }
    public int getTID(){
        return this.tid;
    }
    public void setTID(int tid){
        this.tid = tid;
    }
    public ArrayList<ItemUtility> getTrans(){
        return this.items;
    }
    public int getTU(){
        return this.tu;
    }
    public ArrayList<ItemUtility> getItem(){
        return this.items;
    }
    public void setItem(ArrayList<ItemUtility> item){
        this.items = item;
    }
    
}
