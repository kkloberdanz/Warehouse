/**
 * @author Kyle Kloberdanz
 * Controls the opperations of the entire warehouse
 */

package warehouse; 

class Main {

    /**
     * @author Kyle Kloberdanz
     * Sends a tick with the current count to each section of
     * the ware house. Each section utilizes these ticks to keep
     * synchronized with eachother.
     */
    public static void main(String[] args) { 

        // No visualizer yet
        //Floor     floor     = new Floor();
        Inventory inventory = new Inventory();
        Orders    orders    = new Orders();
        Belt      belt      = new Belt();
        Robot     robot     = new Robot();

        for (int i = 0;; ++i) {
            floor.tick(i);
            inventory.tick(i);
            orders.tick(i);
            belt.tick(i);
            robot.tick(i); 
        }
    }
}
