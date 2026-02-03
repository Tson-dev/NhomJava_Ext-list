/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;

/**
 *
 * @author Nitro5
 */
public class EULs {
    private String itemName;
    private List<Tuple> tuples;
    private int sumUtility;
    private int sumRemainUtility;

    public EULs(String itemName) {
        this.itemName = itemName;
        this.tuples = null;
        this.sumUtility = 0;
        this.sumRemainUtility = 0;
    }

    public String getItemName() {
        return itemName;
    }
    public Tuple getTupleAt(int index) {
        return tuples.get(index);
    }
    public List<Tuple> getTuples() {
        return tuples;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setTuples(List<Tuple> tuples) {
        this.tuples = tuples;
        refresh();
    }
    public void setTupleAt(int index, Tuple tuple) {
        this.tuples.set(index, tuple);
        refresh();
    }

    public void addTuple(Tuple tuple) {
        this.tuples.add(tuple);
        this.sumUtility += tuple.getUtility();
        this.sumRemainUtility += tuple.getRemainUtility();
    }
    public int sumUtility(){
        this.sumUtility = 0;
        for (Tuple tuple : tuples) {
            sumUtility += tuple.getUtility();
        }
        return sumUtility;
    }
    public int sumRemainUtility(){
        this.sumRemainUtility = 0;
        for (Tuple tuple : tuples) {
            sumRemainUtility += tuple.getRemainUtility();
        }
        return sumRemainUtility;
    }
    public void refresh(){
        sumUtility();
        sumRemainUtility();
    }
    public void clear(){
        this.tuples.clear();
        this.sumUtility = 0;
        this.sumRemainUtility = 0;
    }
    public int size(){
        return this.tuples.size();
    }
    public boolean isEmpty(){
        return this.tuples == null || this.tuples.isEmpty();
    }
    public int removeByID(int t_id){
        int removedCount = 0;
        for (int i = 0; i < tuples.size(); ) {
            if (tuples.get(i).getID() == t_id) {
                Tuple removedTuple = tuples.remove(i);
                sumUtility -= removedTuple.getUtility();
                sumRemainUtility -= removedTuple.getRemainUtility();
                removedCount++;
            } else {
                i++;
            }
        }
        return removedCount;
    }

    @Override
    public String toString(){
        String tupleStr = "";
        for (Tuple tuple : tuples) {
            tupleStr += tuple.toString() + "\n";
        }
        return String.format("Item: %s, Sum_Utility: %d, Sum_Remain_Utility: %d, Tuples:\n%s",
                itemName, sumUtility, sumRemainUtility, tupleStr);
    }
}
