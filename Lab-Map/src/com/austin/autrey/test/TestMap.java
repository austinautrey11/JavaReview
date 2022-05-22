package com.austin.autrey.test;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;

public class TestMap {
	
	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("apple", "A forbidden fruit");
		dictionary.put("banana", "A yellow fruit that can be peeled");
		dictionary.put("cantaloupe", "A melon fruit that has an orange flesh");
		// notice when printed that it does not hold no particular order
		System.out.println(dictionary);
		
		String key = "apple";
		String value = dictionary.get(key);
		System.out.println("The value for the key: " + key + " is " + value);
		
		// define a new TreeMap
		// notice when printed that the keys are stored in alphabetical order
		TreeMap<String, String> sortedDictionary = new TreeMap<>();
		sortedDictionary.putAll(dictionary);
		System.out.println(sortedDictionary);
		
		// add another element
		sortedDictionary.put("beets", "An actual vegetable");
		System.out.println(sortedDictionary);
		
		// re-add element but with a differnt value
		sortedDictionary.put("beets", "A better explanation");
		System.out.println(sortedDictionary);
		
		// create a set of keys
		Set<String> keys = sortedDictionary.keySet();
		
		for (String s: keys) {
			System.out.println("key: " + s);
		}
	}

}
