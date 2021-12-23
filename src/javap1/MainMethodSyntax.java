package javap1;

public class MainMethodSyntax {

	public static void main(String ... args) {System.out.println("main method");}
	/*     **Valid syntax**
	 * public static void main(String[] args) {}
	 * public static void main(String []args) {}
	 * public static void main(String [] args) {}
	 * public static void main(String args[]) {}
	 * public static void main(String... args) {}
	 * public static void main(String...args) {}
	 * public static void main(String ... args) {}
	 * static public void main(String[] args) {}
	 * public static final void main(String[] args)  
     *final public static void main(String[] args)  
     *final strictfp public static void main(String[] args)
	 */
	
	/*    **InValid Syntax**
	 * public void main(String[] args) 
	 * static void main(String[] args) 
	 * public void static main(String[] args) 
	 * abstract public static void main(String[] args)
	 */
	}
