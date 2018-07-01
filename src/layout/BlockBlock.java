package layout;

import java.awt.Color;

import inout.Window;

public abstract class BlockBlock extends Block {
	
	int frameSize = 8;
	
	Block[] content;
	
	int getFrameSize() {
		return frameSize;
	}
	void setFrameSize(int frameSize) {
		this.frameSize = frameSize;
	}
	Block[] getContent() {
		return content;
	}
	void setContent(Block[] content) {
		this.content = content;
	}
	
	abstract int getSingleDimension();
	abstract void setSingleDimension(int i);
	abstract int getPluralDimension();
	abstract void setPluralDimension(int i);
	
	abstract int subblockGetSingle(Block subblock);
	abstract int subblockGetPlural(Block subblock);
	
	abstract int getStepX(Block subblock);
	abstract int getStepY(Block subblock);
	
	public BlockBlock(Block[] content) {
		this.content = content;
		setSingleDimension(0);
		setPluralDimension(0);
		for (int i = 0; i < content.length; i++) {
			setPluralDimension(getPluralDimension() + subblockGetPlural(content[i]));
			if (subblockGetSingle(content[i]) > getSingleDimension()) {
				setSingleDimension(subblockGetSingle(content[i]));
			}
		}
		this.setSingleDimension(this.getSingleDimension() + this.getFrameSize());
		this.setPluralDimension(this.getPluralDimension() + this.getFrameSize());
	
	}
	
	@Override
	public void render(int x, int y) {
		Window.drawRectangle(x, y, this.getWidth(), this.getHeight(), Color.lightGray);
		x += (this.getFrameSize() / 2);
		y += (this.getFrameSize() / 2);
		for (Block item : content) {
			item.render(x,y);
			x += this.getStepX(item);
			y += this.getStepY(item);
		}
	}

}
