package layout;

import inout.Window;

public class Lines extends BlockBlock {
	
	public Lines(Block[] content) {
//		super(content);
		int width = 0;
		int height = frameSize;
		for (int i = 0; i < content.length; i++) {
			height += content[i].getHeight();
			if (content[i].getWidth() > width) {
				width = content[i].getWidth();
			}
		}
		this.content = content;
		this.width = width + frameSize;
		this.height = height;
	}

	@Override
	public void render(int x, int y) {
		Window.drawRectangle(x, y, getWidth(), getHeight());
		x += 2;
		y += 2;
//		y += Window.getTextHeight();
		for (Block item : content) {
//			y += item.getHeight();
			item.render(x,y);
			y += item.getHeight();
		}
		
	}

}
