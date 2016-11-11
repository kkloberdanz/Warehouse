/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse;

/**
 *
 * @author lenovo
 */
public class Robot {
    int QuantityCharge;
    boolean Needtocharge;
    int notenoughcharge;
    int NumberofRobot;
    Object location;
    public Robot(int QuantityCharge,int NumberofRobot){
        this.QuantityCharge = QuantityCharge;
        this.NumberofRobot = NumberofRobot;
        
    }
   public boolean needcharge(){
       if(QuantityCharge >= notenoughcharge){
           return (Needtocharge = false);
       }
       else{return Needtocharge = true;}
   }
   public void move(){};
   public void moveshelf(){};
   public Object getRobotlocation(){
       return location;
   }
}
