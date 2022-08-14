package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import data_structures.Trie;

class TrieTest {

	@Test
	void testTrie1() {
		Trie testTrie = new Trie();
		testTrie.addWord("tim");
		
		boolean expected = true;
		boolean actual = testTrie.isWord("tim");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testTrie2() {
		Trie testTrie = new Trie();
		testTrie.addWord("tim");
		testTrie.addWord("joe");
		testTrie.addWord("andy");
		testTrie.addWord("kris");
		testTrie.addWord("bella");
		testTrie.addWord("john");

		boolean expected = true;
		boolean actual = testTrie.isWord("bella");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testTrie3() {
		Trie testTrie = new Trie();
		testTrie.addWord("dog");
		testTrie.addWord("shoe");
		testTrie.addWord("shower");
		testTrie.addWord("cook");
		testTrie.addWord("dug");
		testTrie.addWord("library");
		testTrie.addWord("notebook");

		boolean expected = false;
		boolean actual = testTrie.isWord("shoes");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testTrie4() {
		Trie testTrie = new Trie();
		testTrie.addWord("dog");
		testTrie.addWord("shoe");
		testTrie.addWord("shower");
		testTrie.addWord("cook");
		testTrie.addWord("dug");
		testTrie.addWord("library");
		testTrie.addWord("notebook");

		boolean expected = true;
		boolean actual = testTrie.isWord("dog");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testTrie5() {
		Trie testTrie = new Trie();
		testTrie.addWord("dog");
		testTrie.addWord("shoe");
		testTrie.addWord("shower");
		testTrie.addWord("cook");
		testTrie.addWord("dug");
		testTrie.addWord("library");
		testTrie.addWord("notebook");

		boolean expected = true;
		boolean actual = testTrie.isWord("shoe");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testTrie6() {
		Trie testTrie = new Trie();
		testTrie.addWord("dog");
		testTrie.addWord("shoe");
		testTrie.addWord("shower");
		testTrie.addWord("cook");
		testTrie.addWord("dug");
		testTrie.addWord("library");
		testTrie.addWord("notebook");

		boolean expected = true;
		boolean actual = testTrie.isWord("shower");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testTrie7() {
		Trie testTrie = new Trie();
		testTrie.addWord("dog");
		testTrie.addWord("shoe");
		testTrie.addWord("shower");
		testTrie.addWord("cook");
		testTrie.addWord("dug");
		testTrie.addWord("library");
		testTrie.addWord("notebook");

		boolean expected = true;
		boolean actual = testTrie.isWord("cook");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testTrie8() {
		Trie testTrie = new Trie();
		testTrie.addWord("dog");
		testTrie.addWord("shoe");
		testTrie.addWord("shower");
		testTrie.addWord("cook");
		testTrie.addWord("dug");
		testTrie.addWord("library");
		testTrie.addWord("notebook");

		boolean expected = true;
		boolean actual = testTrie.isWord("dug");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testTrie9() {
		Trie testTrie = new Trie();
		testTrie.addWord("dog");
		testTrie.addWord("shoe");
		testTrie.addWord("shower");
		testTrie.addWord("cook");
		testTrie.addWord("dug");
		testTrie.addWord("library");
		testTrie.addWord("notebook");

		boolean expected = true;
		boolean actual = testTrie.isWord("library");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testTrie10() {
		Trie testTrie = new Trie();
		testTrie.addWord("dog");
		testTrie.addWord("shoe");
		testTrie.addWord("shower");
		testTrie.addWord("cook");
		testTrie.addWord("dug");
		testTrie.addWord("library");
		testTrie.addWord("notebook");

		boolean expected = true;
		boolean actual = testTrie.isWord("notebook");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testTrie11() {
		Trie testTrie = new Trie();
		testTrie.addWord("dog");
		testTrie.addWord("shoe");
		testTrie.addWord("shower");
		testTrie.addWord("cook");
		testTrie.addWord("dug");
		testTrie.addWord("library");
		testTrie.addWord("notebook");

		boolean expected = false;
		boolean actual = testTrie.isWord("dope");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testTrie12() {
		Trie testTrie = new Trie();

		boolean expected = false;
		boolean actual = testTrie.isWord("dope");
		
		assertEquals(expected, actual);
	}

}
