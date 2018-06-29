package composite.demo;

public abstract class Element {
	
	private final int i; 

	public Element(int i) {
		super();
		this.i = i;
	} 

	public abstract int operation();

}
