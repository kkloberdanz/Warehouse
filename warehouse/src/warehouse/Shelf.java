/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse;

import java.awt.Point;
import java.util.HashMap;


public class Shelf {
	HashMap<Item,Integer> contents;
	boolean beingCarried;
	Point shelfLoc;
	public Shelf(Point point, boolean bool){
		contents = new HashMap<>();
                shelfLoc=point;
                beingCarried=bool;
	}
	public void addItem(Item I,int num){
		if (contents.containsKey(I)){
                    int i = contents.get(I);
                    contents.remove(I);
                    contents.put(I, num+i);
                }else{
                    contents.put(I,num);
                }
	}
	public void removeItem(Item I){
		contents.remove(I);
	}
	public void setCarry(boolean carried){
		beingCarried = carried;		
	}
	public void setLoc(int x, int y){
		shelfLoc.setLocation(x,y);
	}
        @Override
        public String toString(){
            return shelfLoc.toString()+","+ Boolean.toString(beingCarried);
        }
}
