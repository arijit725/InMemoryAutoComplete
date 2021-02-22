package org.arijit.autofill.trie.node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrieNode {
	
	private char value;
	Map<Character, TrieNode> trieMap;
	List<String> words;
	boolean end;
	
	public TrieNode(char value) {
		this.value = value;
		this.trieMap = new HashMap<Character, TrieNode>();
		this.words = new ArrayList<>();
	}
	
	public void addNode(char ch, TrieNode node) {
		trieMap.put(ch, node);
	}
	
	public TrieNode getNode(char ch) {
		return trieMap.get(ch);
	}
	
	public boolean isNodePresent(char ch) {
		return trieMap.containsKey(ch);
	}
	
	 public List<String> getWords() {
		return words;
	}
	 
	 public void addWords(String word) {
		 words.add(word);
	 }

	 public void setEnd(boolean end) {
		this.end = end;
	}
	 
	 public boolean isEnd() {
		return end;
	}
}
