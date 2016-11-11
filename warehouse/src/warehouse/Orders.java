package warehouse;

import java.util.ArrayList;

public class Orders {
    
    public class Item {
        public Item(){}
    }
    
    public class Order {
        ArrayList<Item> items;
        String status;
        
        public Order(){
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
        
    }
}
