package helmet_command;

public class BuyHelmet implements Order {
	private Helmet helSize;
	public BuyHelmet(Helmet helSize) {
		this.helSize = helSize;
	}
	
	public void execute() {
		helSize.buy();
	}
}
