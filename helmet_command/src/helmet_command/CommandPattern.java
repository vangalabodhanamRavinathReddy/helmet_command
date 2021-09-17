package helmet_command;

public class CommandPattern {
	public static void main(String[] args) {
		Helmet helSize = new Helmet();
		BuyHelmet buyHelOrder = new BuyHelmet(helSize);
		SellHelmet sellHelOrder = new SellHelmet(helSize);
		Dealer dealer1 = new Dealer();
		dealer1.getOrder(buyHelOrder);
		dealer1.getOrder(sellHelOrder);
		dealer1.giveOrder();
	}
}
