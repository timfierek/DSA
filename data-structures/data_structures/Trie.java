package data_structures;
import java.util.HashMap;

public class Trie {

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
	
	public static void main(String[] args) {
		Trie test = new Trie();
		
		test.addWord("tim");
		test.isWord("tim");
	}
	
	public void addWord(String word) {
		
		TrieNode cur = root;
		
		for(int i = 0; i < word.toCharArray().length; i++) {
			if(cur.children.containsKey(word.charAt(i))) {
				cur = cur.children.get(word.charAt(i));
			}
			else {
				if(i == word.toCharArray().length - 1) {
					cur.children.put(word.charAt(i), new TrieNode(true));
				}
				else {
					cur.children.put(word.charAt(i), new TrieNode(false));
				}
				cur = cur.children.get(word.charAt(i));
			}
		}
	}
	
	public boolean isWord(String word) {
		TrieNode cur = root;
		
		for(int i = 0; i < word.toCharArray().length; i++) {
			if(i == word.toCharArray().length - 1) {
				if(cur.children.containsKey(word.charAt(i))) {
					return cur.children.get(word.charAt(i)).isWord;
				}
				return false;
			}
			
			if(cur.children.containsKey(word.charAt(i))) {
				cur = cur.children.get(word.charAt(i));
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
