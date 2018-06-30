package layout;

import inout.Window;

public class LayoutMain {

	public static void main(String[] args) {
//		Window.open();
		try {
			Window.clear();
		} catch (NullPointerException e) {
			Window.open();
		}
//		Window.clear();
//		String textHeight = Window.getTextHeight();
		String firstMsg = "Hallo Welt!";
		Window.drawText(firstMsg, 70, 50);
		Window.drawRectangle(70-2, 40-2, Window.getTextWidth(firstMsg)+2, Window.getTextHeight()+4);
//		Window.drawRectangle(70, 40, 70, 12);
		String stats = "Height: " + Window.getTextHeight() + ", width: " + Window.getTextWidth(firstMsg);
		Window.drawText(stats, 100, 100);
//		Window.clear();

	}

}
