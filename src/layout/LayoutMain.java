package layout;

import inout.Window;

public class LayoutMain {

	public static void main(String[] args) {
		Window.open();
//		Block testblock = Blocks.lines(
//					Blocks.lines("Hallo", "Welt!"),
//					Blocks.lines("0000000000", "1111111111", "2222222222", "3333333333", 
//					"4444444444", "5555555555", "6666666666", "7777777777", "8888888888", "9999999999"),
//					Blocks.line("blablabla"),
//					Blocks.cols(Blocks.lines("1.1","1.2"),Blocks.lines("2.1"))
//				);
		
		Block testblock = Blocks.lines(
					Blocks.cols(
						Blocks.lines("1st col 1st line", "1st col 2nd line", "1st col 3rd line"),
						Blocks.lines("2nd col 1st line", "2nd col 2nd line")),
					Blocks.line("This line is at the very bottom.")
				);
		testblock.render();

	}

}
