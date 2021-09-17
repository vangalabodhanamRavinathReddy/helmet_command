package helmet_command;

public class SellHelmet implements Order{
	private Helmet helSize;
	public SellHelmet(Helmet helSize) {
		this.helSize = helSize;
	}
	
	public void execute() {
		helSize.sell();
	}
}
