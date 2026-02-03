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
public class Batch {
    public  int batchID;
    ArrayList<Transaction> transactions;
    public Batch(int id) {
        this.batchID = id;
        this.transactions = null;
    }
    public int getBatchID(){
        return batchID;
    }
    public void setBatchID(int id){
        this.batchID = id;
    }
    public ArrayList<Transaction> getTrans(){
       return this.transactions; 
    }
    public void setTrans(ArrayList<Transaction> trans){
        this.transactions = trans;
    }
}
