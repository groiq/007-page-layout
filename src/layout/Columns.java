/*
 * Class for aligning blocks next to each other.
 * 
 * Single dimension is assigned to height, plural dimension to width
 * (there are multiple blocks next to each other, but not on top of each other)
 */

package layout;

public class Columns extends BlockBlock {

	public Columns(Block[] content) {
		super(content);
	}

	@Override
	int getSingleDimension() {
		return this.getHeight();
	}

	@Override
	void setSingleDimension(int i) {
		this.setHeight(i);
	}

	@Override
	int getPluralDimension() {
		return this.getWidth();
	}

	@Override
	void setPluralDimension(int i) {
		this.setWidth(i);
	}

	@Override
	int subblockGetSingle(Block subblock) {
		return subblock.getHeight();
	}

	@Override
	int subblockGetPlural(Block subblock) {
		return subblock.getWidth();
	}

	@Override
	int getStepX(Block subblock) {
		return subblock.getWidth();
	}

	@Override
	int getStepY(Block subblock) {
		return 0;
	}
		
}
