/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warehouse;

import java.util.ArrayList;

public class Floor implements Tick{
	int x_dimension;
	int y_dimension;
	ArrayList<charger> chargers;
	ArrayList<String> usedLocations;
	ArrayList<Shelf> shelves;
	void setUsedLocations(){
		for (charger c:chargers){
			usedLocations.add(Integer.toString(c.xCharLoc) + Integer.toString(c.yCharLoc));
		}
		for(Shelf s: shelves){
			usedLocations.add(Integer.toString(s.xLoc) + Integer.toString(s.yLoc));
		}
	}
	boolean spaceOccupied(int x, int y){
            String loc = Integer.toString(x) + Integer.toString(y);
		return (usedLocations.contains(loc));
	}
        @Override
	public void tick(int count){
		usedLocations.clear();
		setUsedLocations();
	}

   

}
