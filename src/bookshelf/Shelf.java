package bookshelf;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
	} //Default 积己磊. Shelf class甫 积己窍搁 ArrayList档 积己等促. 
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}

}
