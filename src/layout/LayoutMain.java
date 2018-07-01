package layout;

import inout.Window;

public class LayoutMain {
	
	static int testx = 50, testy = 50;
	
	

	public static void main(String[] args) {
		Window.open();
//		try {
//			Window.clear();
//		} catch (NullPointerException e) {
//			Window.open();
//		}
//		Window.clear();
//		String textHeight = Window.getTextHeight();
//		String firstMsg = "Hallo Welt!";
//		Window.drawText(firstMsg, 70, 50);
//		Window.drawRectangle(70-2, 40-2, Window.getTextWidth(firstMsg)+2, Window.getTextHeight()+4);
		Block testblock = Blocks.lines(Blocks.lines("Hallo", "Welt!"),
				Blocks.lines("0000000000", "1111111111", "2222222222", "3333333333", 
				"4444444444", "5555555555", "6666666666", "7777777777", "8888888888", "9999999999"));
//		Block testblock = Blocks.lines("0000000000", "1111111111", "2222222222", "3333333333", 
//				"4444444444", "5555555555", "6666666666", "7777777777", "8888888888", "9999999999");
//		int i = Window.getTextHeight();
//		Window.drawText("textheight: " + i, 20, 20);
		testblock.render();
		
//		Window.drawRectangle(testx, testy, 20, 20);
//		Window.drawText("from main meth", testx, testy);

	}

}
