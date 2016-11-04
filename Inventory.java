import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author george
 */
public class Inventory {
    String item;
    int id;
    int size;
    int weight;
    int quantity;
    ArrayList<Inventory> database;
    Boolean reachcapacity=false;
    public Inventory(String item,int id,int size,int weight){
        this.item=item;
        this.id=id;
        this.size=size;
        this.weight=weight;
    }
    public void initialize(String[] item,int[] id,int[] size,int[] weight){
       for(int i=0;i<item.length;i++){
           Inventory initial=new Inventory(item[i],id[i],size[i],weight[i]);
           
       }
    }
    public void additem(Inventory item){
        
    }
    public void putitemonshelf(Inventory item){
        
    }
    public void removeitem(Inventory item){
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
