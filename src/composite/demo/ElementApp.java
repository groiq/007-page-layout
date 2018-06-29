package composite.demo;

import inout.Out;

public class ElementApp {

	public static void main(String[] args) {
		
		Element e = 
				new Composite(1,  	
						new Element[] { 
							new Atomic(2), 
						    new Composite(3,  	
						    		new Element[] { 
							    		new Atomic(4), 
							        	new Atomic(5)
									}
						         )
							}
					);
		
		int result = e.operation(); 
		
		Out.println(result); 
	}

}
