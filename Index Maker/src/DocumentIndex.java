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
	 * @param word
	 * @return
	 */
	private int foundOrInserted(String word){
		word = word.toUpperCase();
		for(int i= 0; i < super.size(); i++){
			if(super.get(i).getWord().equals(word))
				return i;
		
		}//NEED TO FIX SO ADDS IN ALPHABETICAL
		return -1;
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
	 * @param num
	 */
	public void addWord(String word, int num){
		if(foundOrInserted(word) == -1){
			IndexEntry temp = new IndexEntry(word);
			temp.add(num);
			super.add(new IndexEntry(word)); //NEED TO FIX SO ADDS IN ALPHABETICAL
		}
	}
	
	/**
	 * 
	 * @param str
	 * @param num
	 */
	public void addAllWords(String str, int num){
		
	}
}
