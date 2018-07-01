package layout;

import inout.Window;

public class Columns extends BlockBlock {

	public Columns(Block[] content) {
//		super(content);
		int width = frameSize;
		int height = 0;
		for (int i = 0; i < content.length; i++) {
			width += content[i].getWidth();
			if (content[i].getHeight() > height) {
				height = content[i].getHeight();
			}
		}
		this.width = width;
		this.height = height + frameSize;
		this.content = content;
	}

	@Override
	public void render(int x, int y) {
		Window.drawRectangle(x, y, getWidth(), getHeight());
		x += 2;
		y += 2;
		for (Block item : content) {
			item.render(x,y);
			x += item.getWidth();
		}
		
	}
	


}
