interface IceCream {

	public void customize();
}

class PlainVanilla implements IceCream {

	@Override
	public void customize() {
		System.out.println("Plain Vanilla");
	}
}

class Decorator implements IceCream {

	protected IceCream icecream;
	
	public Decorator(IceCream icecream){
		this.icecream=icecream;
	}
	
	@Override
	public void customize() {
		this.icecream.customize();
	}
}

class ChocolateChip extends Decorator {

	public ChocolateChip(IceCream icecream) {
		super(icecream);
	}

	@Override
	public void customize(){
		super.customize();
		System.out.println(" Adding Chocolate Chips!");
	}
}
class Nuts extends Decorator {

	public Nuts(IceCream icecream) {
		super(icecream);
	}
	
	@Override
	public void customize(){
		super.customize();
		System.out.println(" Adding Nuts!");
	}
}

public class DecoratorDemo {

	public static void main(String[] args) {
		IceCream icecreamWithChips = new ChocolateChip(new PlainVanilla());
		icecreamWithChips.customize();
		
		IceCream icecreamWithChipsAndNuts = new Nuts(new ChocolateChip(new PlainVanilla()));
		icecreamWithChipsAndNuts.customize();
	}

}