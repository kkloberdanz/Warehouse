/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse;

import java.awt.Point;

/**
 *
 * @author Garth Vader
 */
public class TestFloor {

    /**
     * @param args the command line arguments
     */
	
	
    static MockFloor floor;
    static Point p;
    static Shelf s;
    public static void main(String[] args) {
        floor = new MockFloor();
        p= new Point(1,1);s= new Shelf(p,true);floor.shelves.add(s);
        p= new Point(1,2);s= new Shelf(p,false);floor.shelves.add(s);
        p= new Point(2,2);s= new Shelf(p,true);floor.shelves.add(s);
        for (Shelf s:floor.shelves){
            System.out.println(s.toString());
        }
    }
    
    
}
