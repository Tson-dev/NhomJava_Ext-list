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
public class Window {
    public int BatchCount;
    public ArrayList<Batch> danhsachBatch;
    public Window(int batchcount){
        this.BatchCount = batchcount;
        this.danhsachBatch = null;
    }
    public int getBatchCount(){
        return BatchCount;
    }
    public void setBatchCount(int count){
        this.BatchCount = count;
    }
    public ArrayList<Batch> getDanhSach(){
        return this.danhsachBatch;
    }
    public void setDanhSach(ArrayList<Batch> ds){
        this.danhsachBatch = ds;
    }
    
    
    
}
