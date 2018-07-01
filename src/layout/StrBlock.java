package layout;

import inout.Window;

public class StrBlock extends Block {
	
	String content;

	public StrBlock(String content) {
		this.content = content;
		this.height = Window.getTextHeight();
		this.width = Window.getTextWidth(content);
	}

	@Override
	public void render(int x, int y) {
//		Window.open();
		y += Window.getTextHeight();
		Window.drawText(content, x, y);
		
	}

}
