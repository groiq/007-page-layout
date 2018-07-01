/*
 * Class for aligning blocks on top of each other.
 * 
 * Single Dimension is assigned to width, plural dimension to height
 * (there are multiple blocks on top of each other, but not next to each other)
 */

package layout;

public class Lines extends BlockBlock {

	public Lines(Block[] content) {
		super(content);
	}

	@Override
	int getSingleDimension() {
		return this.getWidth();
	}

	@Override
	void setSingleDimension(int i) {
		this.setWidth(i);
	}

	@Override
	int getPluralDimension() {
		return this.getHeight();
	}

	@Override
	void setPluralDimension(int i) {
		this.setHeight(i);
	}

	@Override
	int subblockGetSingle(Block subblock) {
		return subblock.getWidth();
	}

	@Override
	int subblockGetPlural(Block subblock) {
		return subblock.getHeight();
	}

	@Override
	int getStepX(Block subblock) {
		return 0;
	}

	@Override
	int getStepY(Block subblock) {
		return subblock.getHeight();
	}
	
}
