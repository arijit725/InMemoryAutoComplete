package org.arijit.autofill.trie.util;

import java.util.Collections;
import java.util.List;

import org.arijit.autofill.trie.node.TrieNode;

public class AutoFillTrie {
	
	private TrieNode root; 
	
	public AutoFillTrie() {
		root = new TrieNode('\0'); // this is a empty head
	}
	
	public void insert(String word) {
		char[] arr = word.toCharArray();
		TrieNode tmpRoot = root; 
		int i=0;
		while(i<arr.length) {
			char ch = arr[i];
			if(tmpRoot.isNodePresent(ch)) {
				tmpRoot = tmpRoot.getNode(ch);
				tmpRoot.addWords(word);
			}
			else {
				TrieNode node = new TrieNode(ch);
				node.addWords(word);
				tmpRoot.addNode(ch, node);
				tmpRoot = node;
			}
			i++;
		}
		tmpRoot.setEnd(true);
	}
	
	public List<String> suggest(String prefix) {
		char[] arr = prefix.toCharArray();
		TrieNode tmpRoot = root;
		int i=0;
		while(i<arr.length) {
			char ch = arr[i];
			if(tmpRoot!=null && tmpRoot.isNodePresent(ch))
				tmpRoot = tmpRoot.getNode(ch);
			else {
				System.out.println("No data found with such prefix");
				return Collections.EMPTY_LIST;
			}
			i++;
		}
		return tmpRoot.getWords();
	}

}
