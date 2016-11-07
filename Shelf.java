import java.util.HashMap;
import Item;


public class Shelf {
	HashMap<String,Integer> contents;
	boolean beingCarried;
	int xLoc;
	int yLoc;
	public Shelf(){
		contents = new HashMap<Item,Integer>();
	}
	public void addItem(Item I,int num){
		if (contents.getKey(I)==null){
			contents.put(I,num);
		}else{
			int i = contents.get(I);
			contents.remove(I);
			contents.put(I, num+i);
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
