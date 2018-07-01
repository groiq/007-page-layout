/*
 * The basic block class. Mostly sets fields.
 */

package layout;

abstract class Block implements Renderable {
	
	// coordinates for the top left corner
	// note: position 0,0 appears to be covered by the titlebar, so I've set the top left corner to 20,20
	int cornerX = 20;
	int cornerY = 20;
	// fields for block size
	int width;
	int height;

	//Getters and setters
	
	int getWidth() {
		return width;
	}

	void setWidth(int width) {
		this.width = width;
	}

	int getHeight() {
		return height;
	}

	void setHeight(int height) {
		this.height = height;
	}

	// If render() is called without coordinates, render the block in the top left corner.
	@Override
	public void render() {
		render(cornerX,cornerY);
	}

}
