/*
 * Class for a block of blocks. This is the main building block for the block system.
 */

package layout;

import java.awt.Color;

import inout.Window;

abstract class BlockBlock extends Block {
	
	// Amount of padding around the block
	final int frameSize = 8;
	// blocks contained by this block
	final Block[] content;
	
	// some getters
	int getFrameSize() {
		return frameSize;
	}

	Block[] getContent() {
		return content;
	}
	
	/*
	 * This class has two subclasses, one that arranges its blocks in lines and one that arranges them in columns.
	 * Height in the Columns class works like width in the Columns class, and the other way round.
	 * For code reusabiliy, we work with two dimensions, 
	 * one called "plural" (because there are multiple elements arranged in that dimension)
	 * and one called "single" (where there's one element in that dimension).
	 * For this purpose, here are some fake getters / setters that will be assigned to the height and width fields in the subclasses.
	 */
	
	/*
	 * basic getters and setters for the two dimensions
	 */
	abstract int getSingleDimension();
	abstract void setSingleDimension(int i);
	abstract int getPluralDimension();
	abstract void setPluralDimension(int i);
	
	/*
	 * get the relevant dimensions from a subblock
	 * (setters are unnecessary because a block's dimension can't be changed from the outside)
	 */
	abstract int subblockGetSingle(Block subblock);
	abstract int subblockGetPlural(Block subblock);
	
	/*
	 * After rendering a block, move along in the appropriate dimension.
	 * One of these will return the amount to move, the other will return zero.
	 */
	abstract int getStepX(Block subblock);
	abstract int getStepY(Block subblock);
	
	/*
	 * Constructor
	 */
	public BlockBlock(Block[] content) {
		this.content = content;
		setSingleDimension(0);
		setPluralDimension(0);
		// loop through subblocks
		for (int i = 0; i < content.length; i++) {
			// plural dimension is the sum of dimensions of subblocks
			setPluralDimension(getPluralDimension() + subblockGetPlural(content[i]));
			// single dimension is determined by the biggest subblock
			if (subblockGetSingle(content[i]) > getSingleDimension()) {
				setSingleDimension(subblockGetSingle(content[i]));
			}
		}
		// add the frame to block size
		this.setSingleDimension(this.getSingleDimension() + this.getFrameSize());
		this.setPluralDimension(this.getPluralDimension() + this.getFrameSize());
	
	}
	
	// Write block to window
	@Override
	public void render(int x, int y) {
		// draw a frame around the contents
		Window.drawRectangle(x, y, this.getWidth(), this.getHeight(), Color.lightGray);
		// reposition inside of the frame
		x += (this.getFrameSize() / 2);
		y += (this.getFrameSize() / 2);
		// loop through subblocks
		for (Block item : content) {
			// output subblock...
			item.render(x,y);
			// and move to position for the next subblock
			x += this.getStepX(item);
			y += this.getStepY(item);
		}
	}

}
