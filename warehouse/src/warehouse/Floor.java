
package warehouse;

import java.awt.Point;
import java.util.ArrayList;


public interface Floor {
    void setUsedLocations();
    /**
     * This Function will return true if the location passed is occupied
     * @param loc
     * @return True if the location is taken
     */
    boolean isSpaceOccupied(Point loc);
    /**
     * This function returns the picker location
     * @return picker
     */
    Point getPicker(); 
    /**
     * This function returns the packer location
     * @return 
     */
    Point getPacker(); 
    /**
     * This function returns the Shipping Dock location
     * @return shippingDock
     */
    Point getShippingDock();
    /**
     * This Function returns the Receiving Dock Location
     * @return receivingDock
     */
    Point getReceivingDock(); 
    /**
     * This function returns an ArrayList of Points that have chargers at that location
     * @return Array List of Points
     */
    ArrayList<Point> getChargers(); 
}
