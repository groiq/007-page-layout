/*
 * A class with a main method to test everything.
 */

package layout;

import inout.Window;

public class LayoutMain {
	
	/*
	 * If we want to call the factory methods from outside their class,
	 * but don't want to write down the class reference for every method call,
	 * we have to redirect the calls.
	 */
	private static Block line(String line) {
		return Blocks.line(line);
	}
	
	private static Block lines(Block...blocks) {
		return Blocks.lines(blocks);
	}
	
	public static Block lines(String... lines) {
		return Blocks.lines(lines);
	}

	public static Block cols(Block... blocks) {
		return Blocks.cols(blocks);
	}
	

	public static void main(String[] args) {
		/*
		 * A new window instance must be created *before* creating blocks,
		 * otherwise some of the methods from Window aren't available.
		 */
		Window.open();
		
		/*
		 * Two test blocks. Uncomment one to execute it.
		 */
		
//		Block testblock = lines(
//					lines("Hallo", "Welt!"),
//					lines("0000000000", "1111111111", "2222222222", "3333333333", 
//					"4444444444", "5555555555", "6666666666", "7777777777", "8888888888", "9999999999"),
//					line("blablabla"),
//					cols(lines("1.1","1.2"),lines("2.1"))
//				);
		
		Block testblock = lines(
					cols(
						lines("1st col 1st line", "1st col 2nd line", "1st col 3rd line"),
						lines("2nd col 1st line", "2nd col 2nd line")),
					line("This line is at the very bottom.")
				);
		
		/*
		 * Print out the block.
		 */
		testblock.render();

	}

}
