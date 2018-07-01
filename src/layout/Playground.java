package layout;

import inout.Window;

public class Playground {
	
	static int longSide = 10;
	static int shortSide = 5;
	
	static int x = 20;
	static int y = 20;
	
	static Integer width;
	static Integer height;
	
	private static void drawRect() {
		Window.drawRectangle(x,y,width,height);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Window.open();
		
		
		Window.drawText("Landscape mode", x, y);
		
		width = longSide;
		height = shortSide;
		
		y += 10;
		
		drawRect();
		
		y = y + height + 10;
		
		width = shortSide;
		height = longSide;
		
		Window.drawText("portrait mode", x, y);
		y += 10;
		drawRect();
		

	}

}
