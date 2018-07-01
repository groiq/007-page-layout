/*
 * Class for a block containing a single string.
 */

package layout;

import inout.Window;

public class StrBlock extends Block {
	
	// content field is defined here because it's a different type than in other blocks.
	String content;

	// Constructor
	public StrBlock(String content) {
		this.content = content;
		this.height = Window.getTextHeight();
		this.width = Window.getTextWidth(content);
	}

	// Output the string to a window
	@Override
	public void render(int x, int y) {
		// coordinates appear to determine the *bottom* left corner,
		// so for proper alignment we have to add text heigth to the vertical position parameter
		y += Window.getTextHeight();
		Window.drawText(content, x, y);
	}

}
