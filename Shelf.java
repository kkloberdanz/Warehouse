/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap;


public class Shelf {
	HashMap<Item,Integer> contents;
	boolean beingCarried;
	int xLoc;
	int yLoc;
	public Shelf(){
		contents = new HashMap<>();
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
		xLoc = x;
		yLoc = y;
	}
}
