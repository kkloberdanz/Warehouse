package warehouse;

import java.util.ArrayList;

/**
 * 
 * @author Tyler
 *
 */

public class Order implements Tick {
	
	String orderAddress;
	OrderItem[] orderItems;
	boolean isFilled;
	
	public Order (String address, OrderItem[] items){
		orderAddress = address;
		orderItems = items;
		isFilled = false;
	}
}
    
    /*public class Item {
        public Item(){}
    }
    
    public class Orders {
        ArrayList<Item> items;
        String status;
        
        public Orders(){
            items = new ArrayList<>();
            status = "not started";
        }
        
        public void addItem(Item a){
            items.add(a);
        }
        
        public void removeItem(Item a){
            items.remove(a);
        }
        
        public void contains(Item a){
            items.contains(a);
        }
        
        public ArrayList<Item> getItems(){
            return items;
        }
        
    }*/
}
