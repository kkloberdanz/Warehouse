package warehouse;
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
    HashMap<Integer,Inventory> database;
    Boolean reachcapacity=false;
    public Inventory(String item,int id,int size,int weight,int quantity){
        this.item=item;
        this.id=id;
        this.size=size;
        this.weight=weight;
        this.quantity=quantity;
    }
    public void initialize(String[] item,int[] id,int[] size,int[] weight,int[] quantity){
       for(int i=0;i<item.length;i++){
           Inventory initial=new Inventory(item[i],id[i],size[i],weight[i],quantity[i]);
           additem(initial);
           putitemonshelf(initial);
       }
    }
    public void additem(Inventory item){
        if(database.containsKey(item.id)){
            database.get(item.id).quantity+=item.quantity;
        }
        else{
            database.put(item.id,item);
        }
    }
    public void putitemonshelf(Inventory item){
                                    
    }
    public void removeitem(Inventory item){
        if(!database.containsKey(item.id)){
            System.out.println("We don't have this product in stock");
        }
        else{
            if(database.get(item.id).quantity<item.quantity){
                System.out.println("We don't have enough products in stock, please add more products or reduce the number of products to be shippped");
            }
            else{
                database.get(item.id).quantity-=item.quantity;
            }
        }
    }
    public void removeitemonshelf(Inventory item){
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
