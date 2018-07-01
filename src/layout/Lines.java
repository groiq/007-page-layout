package layout;

import inout.Window;

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
	void subblockSetSingle(int i, Block subblock) {
		subblock.setWidth(i);
	}

	@Override
	int subblockGetPlural(Block subblock) {
		return subblock.getHeight();
	}

	@Override
	void subblockSetPlural(int i, Block subblock) {
		subblock.setHeight(i);
	}

	@Override
	int getStepX(Block subblock) {
		return 0;
	}

	@Override
	int getStepY(Block subblock) {
		return subblock.getHeight();
	}
	
	

//	@Override
//	int getSinglePosition() {
//		return 0;
//	}
//
//	@Override
//	void setSinglePosition(int pos) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	int getPluralPosition() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	void setPluralPosition(int pos) {
//		// TODO Auto-generated method stub
//		
//	}
	


}
