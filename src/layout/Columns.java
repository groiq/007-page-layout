package layout;

public class Columns extends BlockBlock {

	public Columns(Block[] content) {
		super(content);
		int width = frameSize;
		int height = frameSize;
		for (int i = 0; i < content.length; i++) {
			width += content[i].getWidth();
			if (content[i].getHeight() > height) {
				height = content[i].getHeight();
			}
		}
		this.width = width;
		this.height = height;
	}

	@Override
	public void render(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	


}
