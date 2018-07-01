package layout;

public class Lines extends BlockBlock {
	
	
	
	public Lines(Block... content) {
		super(content);
		int counter = 0;
		int width = 0;
		int height = 0;
		for (Block curBlock : content) {
			counter += 1;
			if (curBlock.getWidth() > width) {
				width = curBlock.getWidth();
			}
			height += curBlock.getHeight();
		}
		this.width = width;
		this.height = height;
		this.content = new Block[counter];
		counter = 0;
		for (Block curBlock : content) {
			this.content[counter] = curBlock;
			counter += 1;
		}
	}

}
