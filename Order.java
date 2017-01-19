
/**
 * @author Ghadah
 *
 */
import java.util.*;

public class Order {

  private static int order_num = 0;
  private ArrayList<MenuItem> order = new ArrayList<MenuItem>();
  boolean isConfirmed = false;
  private String status;

  public Order(MenuItem m) {
    getOrder().add(m);
    order_num++;
  }

  public void modifyOrder(int orderNumber) {
    if (getOrder().contains(getOrder().get(orderNumber))) {
      getOrder().remove(orderNumber);
      getOrder().add(new MenuItem());
    }
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }

  public void cancelOrder(int orderNum) {
    if (!getOrder().isEmpty())
      getOrder().remove(order_num);
  }

  public void confirmOrder() {
    isConfirmed = true;
  }

  public int getOrderTime() { // name of variable (Time)
    int time = 0;
    for (int i = 0; i < getOrder().size(); i++) {
      time += getOrder().get(i).time;
    }
    return time;

  }

  public int getOrderTotal() {   // name of variable (price)
    int total = 0;
    for (int i = 0; i < getOrder().size(); i++) {
      total += getOrder().get(i).price;
    }
    return total;
  }

  public ArrayList<MenuItem> getOrder() {
    return order;
  }

}
