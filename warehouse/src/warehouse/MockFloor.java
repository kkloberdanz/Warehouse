/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse;
import java.awt.Point;
import java.util.ArrayList;

public class MockFloor implements Floor{
    final Point picker = new Point(0,10);
    final Point packer = new Point(0,150);
    final Point shippingDock = new Point(0,0);
    final Point receivingDock = new Point(80,0);
    final int x_dimension = 160;
    final int y_dimension = 200;
    ArrayList<charger> chargers= new ArrayList<>();;
    ArrayList<Point> usedLocations= new ArrayList<>();;
    ArrayList<Shelf> shelves= new ArrayList<>();

    /**
     *This Function will set the currently used locations by objects in the area. 
     * Considered adding shelves, but I think I would like to have shelves with
     * space under them so robots can drive underneath them
     */
    @Override
    public void setUsedLocations(){
        usedLocations.clear();
        for (charger c:chargers){
            usedLocations.add(c.charLoc);
        }
        usedLocations.add(picker);
        usedLocations.add(packer);
        usedLocations.add(shippingDock);
        usedLocations.add(receivingDock);
    }
    /**
     * This function returns the picker location
     * @return picker
     */
    @Override
    public Point getPicker() {return picker;}
    /**
     * This function returns the packer location
     * @return 
     */
    @Override
    public Point getPacker() {return packer;}
    /**
     * This function returns the Shipping Dock location
     * @return shippingDock
     */
    @Override
    public Point getShippingDock() {return shippingDock;}
    /**
     * This Function returns the Receiving Dock Location
     * @return receivingDock
     */
    @Override
    public Point getReceivingDock() {return receivingDock;}
    /**
     * This function returns an ArrayList of Points that have chargers at that location
     * @return Array List of Points
     */
    @Override
    public ArrayList<Point> getChargers() {
        ArrayList<Point> Temp = new ArrayList<>();
        for (charger c: chargers){
            Temp.add(c.charLoc);
        }
        return Temp;
    }
    /**
     * This Function will return true if the location passed is occupied
     * @param loc
     * @return True if the location is taken
     */
    @Override
    public boolean isSpaceOccupied(Point loc){
        return (usedLocations.contains(loc));
    }
}