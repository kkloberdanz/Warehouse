package warehouse;

import java.util.ArrayList;



public class Belt implements Tick{
	
	ArrayList<Integer> belt = new ArrayList<Integer>(10);
	ArrayList<Integer> ship = new ArrayList<Integer>();
	
	int tick = 0;
	
	public void packBin(int x){
		int y;
		belt.add(x);
		if(belt.get(9) != 0){
			y = belt.get(9);
			ship.add(y);
			belt.remove(9);
		}else{
			belt.remove(9);
		}	
	}
	
	public void showBelt(){
		for(int i = 0; i < belt.size(); i++){
			System.out.println(belt.get(i));
		}
	}
	
	public void showShip(){
		for(int i = 0; i < ship.size(); i++){
			System.out.println(ship.get(i));
		}
	}
	
	public void tick(int x){
		
	}

}