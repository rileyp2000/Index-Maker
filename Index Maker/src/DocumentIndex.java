/**
 * <p></p>
 * @author Patrick Riley
 */

import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry>{
	
	public DocumentIndex(){
		super();
	}
	
	/**
	 * 
	 * @param cap Capacity
	 */
	public DocumentIndex(int cap){
		super(cap);
	}
	/**
	 * 
	 * @param word
	 * @return
	 */
	private int foundOrInserted(String word){
		word = word.toUpperCase();
		boolean isInserted = false;
		int i = 0; 
		String compWord = "";
		while(i < super.size() && !isInserted) {
			compWord = super.get(i).getWord();
			if(compWord.equals(word))
				return i;
			else if(compWord.compareTo(word)<0)
					i++;
			else {
				this.add(i, new IndexEntry(word));
				isInserted = true;
				return i;
			}
		}
			this.add(new IndexEntry(word));
			return i;
	}
	


	
	/**
	 * 
	 * @param word
	 * @param num
	 */
	public void addWord(String word, int num){
		this.get(foundOrInserted(word)).add(num);
	}
	
	/**
	 * 
	 * @param str
	 * @param num
	 */
	public void addAllWords(String str, int num){
		
	}
}
