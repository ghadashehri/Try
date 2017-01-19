import java.util.*;
public class Order {
    
    public static int order_num = 0;
    private ArrayList<MenuItem> order= new ArrayList<MenuItem>();
    public boolean orderStat = false;
    public String status;
    
    public Order(MenuItem m){
      if(orderStat){
        order.add(m);
        order_num++;
        }
    }
    
    public void modifyOrder(int orderNumber){           //check the attribute
        if(order.contains(order.get(orderNumber))){
          order.remove(orderNumber);
          order.add(new MenuItem());
        }
    }
    
    public void setStatus(){                        //NOT YET DONE!!
      //placed 
        
      // pending 
        
      // delivered 
    }
    
    public String getStatus(){
      if(orderStat)
        return "Pending";
      else
        return "Not Placed";
    }
    
    public void cancelOrder(int orderNum){
      if(!order.isEmpty())
        order.remove(order_num);
    }
    
    public void confirmOrder(){                                  // CHECK THIS !!!
      orderStat = true;
    }
    
    public int getOrderTime(){
      int time = 0;   
      for(int i =0; i<order.size();i++){
           time += order.get(i).timeTaken;
         }
      return time;
      
    }
    
    public int getOrderTotal(){
      int total = 0;   
      for(int i =0; i<order.size();i++){
           total += order.get(i).price;
         }
      return total;
    }
}
