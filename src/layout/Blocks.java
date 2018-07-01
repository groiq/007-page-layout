/*
 * Factory methods for block generation.
 */

package layout;

public class Blocks {
	
	// Creates a block from a single string.
	public static Block line(String line) {
		return new StrBlock(line);
	}
	
	// Takes several blocks and arranges them on top of each other.
	public static Block lines(Block... blocks) {
		return new Lines(blocks);
	}
	
	// Takes several blocks and arranges them side by side.
	public static Block cols(Block... blocks) {
		return new Columns(blocks);
	}
	
	// A combination of line() and lines(), this takes several strings and arranges them on top of each other.
	public static Block lines(String... lines) {
		StrBlock[] blocks = new StrBlock[lines.length];
		int counter = 0;
		for (String line : lines) {
			blocks[counter] = new StrBlock(line);
			counter++;
		}
		return new Lines(blocks);
	}

}
