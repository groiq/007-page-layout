package layout;

import inout.Window;

public class Block implements Renderable {
	
	String testtext = "Hallo Welt!";

	public Block() {
		// TODO Auto-generated constructor stub
	}
	
	public Block line(String line) {
		
		return null;
	}
	
	public Block lines(Block... blocks) {
		
		return null;
	}
	
	public Block lines(String... lines) {
		
		return null;
	}
	
	public Block cols(Block... blocks) {
		
		return null;
	}

	@Override
	public void render(int x, int y) {
		Window.open();
		Window.drawText(testtext, x, y);
		
	}

	@Override
	public void render() {
		render(20,20);	// bug: position 0,0 is covered by the titlebar
		
	}

}
