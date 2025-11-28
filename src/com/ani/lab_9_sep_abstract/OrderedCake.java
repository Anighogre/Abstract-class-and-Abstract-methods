package com.ani.lab_9_sep_abstract;

public class OrderedCake extends Cake {
	private String message;

	public OrderedCake() {
		super("Round", "Vanila", 4);
	}
	public OrderedCake(String shape, String flavor, int quantity) {
		super(shape, flavor, quantity);
	}

	public OrderedCake(String shape, String flavor, int quantity, String message) {
		super(shape, flavor, quantity);
		this.message = message;
	}

	@Override
	public String toString() {

		if (message == null || message.isEmpty()) {
			return super.toString();
		} else
			return "A " + getShape() + " " + getFlavor() + " Cake of " + getQuantity() + "KG is Ready with "
					+ this.message + " message @ Rs." + (getQuantity() * Cake.PRICE);
	}

}
