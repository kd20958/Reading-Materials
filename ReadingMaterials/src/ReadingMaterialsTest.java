/**
 * 
 * @author Kevin
 *
 */
public class ReadingMaterialsTest {
	
	public static void main(String[] args) {
		Books b = new Books();
		Novels n = new Novels();
		
		System.out.println("-Book;\n ");
		b.setName("MainCharacterName1, MainCharaterName2");
		b.setPages(700);
		b.writeOutput();
		
		System.out.println("\n-Novel;\n ");
		n.setName("MainCharacterName1, MainCharaterName2");
		n.setPages(550);
		n.writeOutput();
		
	}
}
