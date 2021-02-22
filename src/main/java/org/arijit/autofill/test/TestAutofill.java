package org.arijit.autofill.test;

import org.arijit.autofill.trie.util.AutoFillTrie;

public class TestAutofill {
	
	public static void main(String args[]) {
		String arr[] = {"wallmart","wallstreet","geeksforgeeks","waldomart","word","great"};
		AutoFillTrie autoFillTrie = new AutoFillTrie();
		for(String str:arr) {
			autoFillTrie.insert(str);
		}
		
		System.out.println(autoFillTrie.suggest("wo"));
	}

}
