/**
 * 
 * @author Kevin
 *
 */
public class Books extends ReadingMaterials {
	private int pages;
	public Books() {
		super();
		pages = 0;
	}
	
	public Books(String intialName, int initialPages) {
		super(intialName);
		pages = initialPages;
	}
	
	public void reset(String newName, int newPages) {
		setName(newName);
		pages = newPages;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int newPages) {
		pages = newPages;
	}
	
	public void writeOutput() {
		System.out.println("Name of Characters: " + getName());
		System.out.println("Amount of Pages: " + pages);
	}
	
	public boolean equals(Books otherBooks) {
		return this.hasSameName(otherBooks) && (this.pages == otherBooks.pages);
	}
}

