package composite.demo;

public class Atomic extends Element {
	
	public Atomic(int i) {
		super(i);
	}

	@Override
	public int operation() {
		return 1; 
	}

}
