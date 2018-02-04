// Immutable object in Java:

final public class MediumPostalShippingBox{

	final private int length;
	final private int width;
	final private int height;
	
	public MediumPostalShippingBox(int length, int width, int height){

		this.length = length;
		this.width = width;
		this.height = height;

	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}
	private int getHeight() {
		return height;
	}

	public void boxSize() {
		System.out.println("A medium postal box is " + length + " x " + width + " x " + height);
	}

	public void ship() {
		System.out.println("Time to ship this package!");
	}

	public static void main(String[] args) {

		MediumPostalShippingBox mediumBox = new MediumPostalShippingBox(11,8,6);
		mediumBox.boxSize();
		mediumBox.ship();

	}
}
