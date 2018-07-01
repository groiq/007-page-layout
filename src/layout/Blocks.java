package layout;

public class Blocks {

	public Blocks() {
		// TODO Auto-generated constructor stub
	}
	
	public static Block line(String line) {
		return new StrBlock(line);
	}
	
	public static Block lines(Block... blocks) {
		return new Lines(blocks);
	}
	
	public static Block lines(String... lines) {
		StrBlock[] blocks = new StrBlock[lines.length];
		int counter = 0;
		for (String line : lines) {
			blocks[counter] = new StrBlock(line);
			counter++;
		}
		return new Lines(blocks);
	}
	
	public static Block cols(Block... blocks) {
		return new Columns(blocks);
	}


}
