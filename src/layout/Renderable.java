/*
 * This interface defines a render() method for writing content to a window.
 * One can call render() with or without coordinates for placing content;
 * in the second case it defaults to the top left corner.
 */

package layout;

public interface Renderable {
	
	public void render(int x, int y);
	public void render();

}
