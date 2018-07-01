package layout;

import inout.Window;

public class Block implements Renderable {
	
	String testtext = "Hallo Welt!";
	int cornerX = 20;
	int cornerY = 20;
	// bug: position 0,0 is covered by the titlebar, so I'll set the top left corner to 20,20
	int width;
	int height;

	public Block() {
		// TODO Auto-generated constructor stub
	}
	

	int getWidth() {
		return width;
	}


	void setWidth(int width) {
		this.width = width;
	}


	int getHeight() {
		return height;
	}


	void setHeight(int height) {
		this.height = height;
	}


	@Override
	public void render(int x, int y) {
		Window.open();
		Window.drawText(testtext, x, y);
		
	}

	@Override
	public void render() {
		render(cornerX,cornerY);
		
	}

}
