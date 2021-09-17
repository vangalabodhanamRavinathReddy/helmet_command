package helmet_command;

import java.util.ArrayList;
import java.util.List;
public class Dealer {
	private List<Order> orderList = new ArrayList<Order>();
	
	public void getOrder(Order order) {
		orderList.add(order);
	}
	
	public void giveOrder() {
		for(Order order: orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
