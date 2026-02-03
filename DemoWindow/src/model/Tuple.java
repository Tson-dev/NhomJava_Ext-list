/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nitro5
 */
public class Tuple {
     private int t_id;
    private int utility;
    private int remain_utility;
    private int prefix_utility;
    private int extension;

    public Tuple(int t_id, int utility, int remain_utility, int prefix_utility, int extension) {
        this.t_id = t_id;
        this.utility = utility;
        this.remain_utility = remain_utility;
        this.prefix_utility = prefix_utility;
        this.extension = extension;
    }

    public int getID(){
        return this.t_id;
    }
    public int getUtility(){
        return this.utility;
    }
    public int getRemainUtility(){
        return this.remain_utility;
    }
    public int getPrefixUtility(){
        return this.prefix_utility;
    }
    public int getExtension(){
        return this.extension;
    }

    public void setID(int id){
        this.t_id = id;
    }
    public void setUtility(int utility){
        this.utility = utility;
    }
    public void setRemainUtility(int remain_utility){
        this.remain_utility = remain_utility;
    }
    public void setPrefixUtility(int prefix_utility){
        this.prefix_utility = prefix_utility;
    }
    public void setExtension(int extension){
        this.extension = extension;
    }

    @Override
    public String toString(){
        return String.format("T_id: %d, Utility: %d, Remain_Utility: %d, Prefix_Utility: %d, Extension: %d",
                t_id, utility, remain_utility, prefix_utility, extension);
    }
}
