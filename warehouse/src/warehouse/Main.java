/**
 * @author Kyle Kloberdanz
 * Controls the opperations of the entire warehouse
 */

package warehouse; 

class Main {

    /**
     * @author Kyle Kloberdanz
     * @return void
     *
     * Sends a tick with the current count to each section of
     * the ware house. Each section utilizes these ticks to keep
     * synchronized with eachother.
     */
    public static void main(String[] args) { 

        // No visualizer yet
        MockFloor     floor = new MockFloor();
        Inventory inventory = new Inventory();
        Orders    orders    = new Orders();
        Belt      belt      = new Belt();
        Robot     robot     = new Robot(100, 1);

        for (int i = 0;; ++i) {
            floor.tick(i);
            inventory.tick(i);
            orders.tick(i);
            belt.tick(i);
            robot.tick(i); 
        }
    }
}
