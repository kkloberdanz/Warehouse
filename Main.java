package main

class Main {
    public static void main(String[] args) { 

        // No visualizer yet
        Floor floor = new Floor();
        Inventory inventory = new Inventory();
        Orders orders = new Orders();
        Robot robot = new Robot();

        for (int i = 0;; ++i) {
            floor.tick(i);
            inventory.tick(i);
            orders.tick(i);
            robot.tick(i);
        }
    }
}
