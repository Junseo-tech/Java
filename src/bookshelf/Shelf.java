package bookshelf;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
	} //Default ������. Shelf class�� �����ϸ� ArrayList�� �����ȴ�. 
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}

}
