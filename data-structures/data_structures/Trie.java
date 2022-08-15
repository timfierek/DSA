package data_structures;
import java.util.HashMap;

/**
 * Basic implementation of a prefix tree (trie) with time complexities for most methods.
 * See TrieTest.java for example test cases.
 * 
 * @author Tim Fierek
 *
 */
public class Trie {

	/**
	 * Simple nested node class which stores the boolean isWord and a hashmap of children nodes
	 */
	private class TrieNode{
		private boolean isWord;
		private HashMap<Character, TrieNode> children;
		
		public TrieNode(boolean isWord) {
			children = new HashMap<>();
			this.isWord = isWord;
		}
	}
	
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode(false);
	}

	/**
	 * Adds the word letter by letter, adding the isWord tag at the end of the word
	 * 
	 * @param word word to be added to the trie
	 * @TimeComplexity O(n) where n is the number of characters in word
	 */
	public void addWord(String word) {
		
		TrieNode curNode = root;
		
		// Iterate character by character through the word, adding it in
		for(int i = 0; i < word.toCharArray().length; i++) {
			char curChar = word.charAt(i);
			
			//if the current node's children has the current char in it, move curNode pointer to that node
			if(curNode.children.containsKey(curChar)) {
				curNode = curNode.children.get(curChar);
			}
			//...otherwise, add that character in to the children, and then advance curNode pointer
			else {
				if(i == word.toCharArray().length - 1) {
					curNode.children.put(curChar, new TrieNode(true));
				}
				else {
					curNode.children.put(curChar, new TrieNode(false));
				}
				curNode = curNode.children.get(curChar);
			}
		}
	}
	
	/**
	 * Searches the trie for the input' word and returns whether or not is exists in the trie
	 * 
	 * @param word word to be searched for
	 * @return true if the word is in the trie, false otherwise
	 * @TimeComplexity O(n) where n is the number of chars in the word
	 */
	public boolean isWord(String word) {
		TrieNode curNode = root;
		
		//Iterate through each character in the word
		for(int i = 0; i < word.toCharArray().length; i++) {
			char curChar = word.charAt(i);
			
			// if this is the last character
			if(i == word.toCharArray().length - 1) {
				// check if the character is in the children
				if(curNode.children.containsKey(curChar)) {
					// return whether or not that last char is a end of word marker
					return curNode.children.get(curChar).isWord;
				}
				return false;
			}
			
			// if the character is in the current nodes children, then continue
			if(curNode.children.containsKey(curChar)) {
				curNode = curNode.children.get(curChar);
			}
			else {
				return false;
			}
		}
		
		return false;
	}
	
	// TODO: implement deleteWord method
	public boolean deleteWord(String word) {
		return false;
	}
	
}
